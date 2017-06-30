var app = angular.module('app', ['ngAnimate', 'ngSanitize', 'ui.bootstrap']);

app.service('TrasiiCRUDService', [ '$http', function($http) {

    this.getTrasii = function getTrasii(trasii){
        return $http({
            method : 'GET',
            url : '/trasii/'+trasii.id.compaak+'/'+trasii.id.empresa+'/'+trasii.id.ejercio+'/'+trasii.id.periodo+'/'+trasii.id.eminif+'/'+trasii.id.facnum+'/'+trasii.id.facfec+'/'+trasii.id.facter,
        });
    }
    
    this.updateTrasii = function updateTrasii(updatedEntity){
        return $http({
            method : 'POST',
            url : '/trasii/'+updatedEntity.id.compaak+'/'+updatedEntity.id.empresa+'/'+updatedEntity.id.ejercio+'/'+updatedEntity.id.periodo+'/'+updatedEntity.id.eminif+'/'+updatedEntity.id.facnum+'/'+updatedEntity.id.facfec+'/'+updatedEntity.id.facter,
            data : updatedEntity
        });
    }

    this.procesarRegistros = function procesarRegistros(registros){
        return $http({
            method : 'POST',
            url : '/trasii/procesar',
            data : {
                registros
            }
        });
    }
    
    this.getAllTrasii = function getAllTrasii() {
        return $http({
            method : 'GET',
            url : '/trasii'
        });
    }
    

//    this.deleteTrasii = function deleteTrasii(trasii2) {
//        return $http({
//            method : 'DELETE',
//            url : '/trasii/'+trasii2.compaak+'/'+trasii2.empresa+'/'+trasii2.ejercio+'/'+trasii2.periodo+'/'+trasii2.eminif+'/'+trasii2.facnum+'/'+trasii2.facfec+'/'+trasii2.facter,
//        })
//    }
    
//  this.addTrasii = function addTrasii(trasii){
//  return $http({
//      method : 'POST',
//      url : '/trasii',
//      data : {
//          trasii3
//      }
//  });
//}
}
]);

app.controller('TrasiiCRUDCtrl', ['$scope','TrasiiCRUDService', '$uibModal', '$log', '$filter',
    function ($scope, TrasiiCRUDService, $uibModal, $log, $filter) {

		$scope.btnProcesar = "";
		$scope.years = {
			"2016":"2016",
			"2017":"2017",
			"2018":"2018",
			"2019":"2019",
			"2020":"2020"
		};
		$scope.months = {
			"01":"Enero",
			"02":"Febrero",
			"03":"Marzo",
			"04":"Abril",
			"05":"Mayo",
			"06":"Junio",
			"07":"Julio",
			"08":"Agosto",
			"09":"Septiembre",
			"10":"Octubre",
			"11":"Noviembre",
			"12":"Diciembre"
		};
        var setOfKeys = new StringSet();
        $scope.totalItems = 0;
        $scope.currentPage = 1;
        $scope.itemsPerPage = 1000;
        $scope.itemsToShow;
        $scope.rowIndex = -1;
        $scope.isRowSelected = [];
        $scope.allItems = [];
        
        $scope.swichState = function(){
        	$scope.itemsToShow = [];
        	var onlyPendientes = $scope.csvSwitch == "empty";
        	angular.forEach($scope.allItems, (row) => {
        		if(onlyPendientes && row.rescsv.trim().length == 0){ // Si campo RESCSV esta vacio significa que esta pendiente
    				$scope.itemsToShow.push(row);
    			}else if(!onlyPendientes && row.rescsv.trim().length > 0){ // Si el campo RESCSV NO esta vacio significa que esta procesado
    				$scope.itemsToShow.push(row);
    			}
        	});
        };
        
        $scope.setPage = function (pageNo) {
            $scope.currentPage = pageNo;
        };
        
        $scope.pageChanged = function() {
            var offset = ($scope.currentPage - 1) * $scope.itemsPerPage;
            var to = offset + $scope.itemsPerPage;
            $scope.itemsToShow = $scope.trasii2.slice(offset,to);
            $log.log('Showing items -> From: ' + offset + ' To: ' + to);
        };
       
        $scope.selectAll = function(tipo){
        	// $scope.filteredData = $filter('filter')($scope.itemsToShow, $scope.trasiisfilter.id.facter);
        	//if($scope.trasiisfilter.id.facter == ""){
        		//$scope.errorMessage = 'Hay que seleccionar un tipo de factura antes. [R-F].';
        	//}else{
	            setOfKeys.clear();
	    		$scope.modo = "";
	    		$scope.isRowSelected = [];
	    		
	        	angular.forEach($scope.itemsToShow, (item) => {
	        		if(item.id.facter == tipo){
	        			$log.log(' item.id.facter == tipo ' + item.id.facter + " - " + tipo);
	        			$scope.setSelected(item,item.id.facnum)
	        		}
	        	});
        	//}
        };
        
        $scope.setSelected = function(tra,facnum) {
        	if(tra.rescsv.trim() !== ""){
        		$scope.errorMessage = 'No se pueden seleccionar registros ya procesados [CSV].';
        	}else{
	        	if($scope.modo === undefined || $scope.modo == "" || $scope.modo == tra.id.facter ){
	        		$scope.errorMessage = '';
	        		$scope.modo = tra.id.facter;
	        		$scope.isRowSelected[facnum] = ( $scope.isRowSelected[facnum] === undefined || $scope.isRowSelected[facnum] === false ) ? true : false;
	                var keyRow = tra.id.compaak.concat("||").concat(tra.id.empresa).concat("||").concat(tra.id.ejercio).concat("||").concat(tra.id.periodo).concat("||").concat(tra.id.eminif).concat("||").concat(tra.id.facnum).concat("||").concat(tra.id.facfec).concat("||").concat(tra.id.facter);
	                if(setOfKeys.contains(keyRow)){
	                    setOfKeys.remove(keyRow);
	                    if(setOfKeys.values().length == 0){
	                    	$scope.modo = ""; // Reseteamos el control de modo
	                    }
	                }else{
	                    setOfKeys.add(keyRow);
	                }
	                console.log(setOfKeys.values());
	                
	        	}else{ // Esta seleccionando registros de facturas emitidas y recibidas a la misma vez.
	        		$scope.errorMessage = 'No se pueden seleccionar registros de facturas emitidas y recibidas a la misma vez.';
	        	}
        	}
        };

        $scope.procesarRegistros = function(){
            if(setOfKeys.values().length > 0){
            	$scope.btnProcesar = "false";
                TrasiiCRUDService.procesarRegistros(setOfKeys.values())
                    .then(function success(response) {
                            $scope.allItems = response.data;
                            $scope.trasii2 = $scope.allItems;
                            $scope.totalItems = $scope.trasii2.length;
                            $scope.itemsToShow = $scope.trasii2.slice(0, $scope.itemsPerPage);
                            $scope.currentPage = 1;
                            $scope.message = '';
                            $scope.errorMessage = '';
                            $scope.isRowSelected = []
                            setOfKeys.clear();
                            $scope.noOfPages = Math.ceil($scope.itemsToShow.length/$scope.entryLimit); 
                            $scope.modo = ""; // Reseteamos el control de modo
                    },
                    function error(response) {
                        $scope.message = '';
                        $scope.errorMessage = 'Error procesando registros Trasii!';
                        $scope.modo = ""; // Reseteamos el control de modo
                        $scope.isRowSelected = []; // Deseleccionamos las rows
                    });
                	$scope.btnProcesar = "";
            }else {
                $scope.message = '';
                $scope.errorMessage = 'No hay ningun registro seleccionado!';
                console.info('No hay ningun registro seleccionado!');
            }
        }
        
        function StringSet() {
            var setObj = {}, val = {};
            
            this.clear = function(){
                setObj = {};
                val = {};
            }
            this.add = function(str) {
                setObj[str] = val;
            };
            this.contains = function(str) {
                return setObj[str] === val;
            };
            this.remove = function(str) {
                delete setObj[str];
            };
            this.values = function() {
                var values = [];
                for (var i in setObj) {
                    if (setObj[i] === val) {
                        values.push(i);
                    }
                }
                return values;
            };
        }

//        $scope.dataForModal = {
//            name: 'NameToEdit',
//            value: 'ValueToEdit'
//        }
        
        $scope.open = function(tra){
        	$scope.trasiimodal = tra;
        	
        	$scope.theModal = $uibModal.open({
            	scope: $scope,
                templateUrl : '../partial-views/editing-form.html',
//                resolve: {
//                    modalData: function() {
//                        return $scope.dataForModal;
//                    }
//                }
            });
            
            $scope.ok = function () {
            	var newData = $scope.trasiimodal;
                $scope.updateTrasii(newData);
                $scope.theModal.close();
            };

            $scope.cancel = function () {
            	console.log('Dismissed');
            	$scope.theModal.dismiss();
            };

            
            
//            modalInstance.result.then(function(result) {
//                console.info("I was closed, so do what I need to do myContent's controller now.  Result was->");
//                console.info(result);
//            }, function () {
//                $log.info('Modal dismissed at: ' + new Date());
//            });
        };
        
      

        $scope.getAllTrasii = function () {
            TrasiiCRUDService.getAllTrasii()
                .then(function success(response) {
                        $scope.allItems = response.data;
                        $scope.trasii2 = $scope.allItems;
                        $scope.totalPages = Math.ceil($scope.trasii2.length / $scope.itemsPerPage);
                        $scope.totalItems = $scope.trasii2.length
                        $scope.itemsToShow = $scope.trasii2.slice(0,$scope.itemsPerPage);
                        $scope.message='';
                        $scope.errorMessage = '';
                    },
                    function error (response) {
                        $scope.message='';
                        $scope.errorMessage = 'Error getting Trasii!';
                    });
            
        }

        $scope.getTrasii = function (selectedRow) {
            TrasiiCRUDService.getTrasii(selectedRow)
                .then(function success(response) {
                        $scope.trasii = response.data;
                        $scope.message='';
                        $scope.errorMessage = '';
                    },
                    function error (response) {
                        $scope.message = '';
                        if (response.status === 404){
                            $scope.errorMessage = 'Trasii not found!';
                        }
                        else {
                            $scope.errorMessage = "Error getting Trasii!";
                        }
                    });
        };

        $scope.updateTrasii = function (selectedRow) {
            TrasiiCRUDService.updateTrasii(selectedRow)
                .then(function success(response) {
                        $scope.message = 'Trasii data updated!';
                        $scope.errorMessage = '';
                    },
                    function error(response) {
                        $scope.errorMessage = 'Error updating Trasii!';
                        $scope.message = '';
                    });
        };

        /*
        $scope.addTrasii = function () {
            if ($scope.trasii2 != null && $scope.trasii2.compaak && $scope.trasii2.empresa && $scope.trasii2.ejercio && $scope.trasii2.periodo
                && $scope.trasii2.eminif && $scope.trasii2.facnum && $scope.trasii2.facfec && $scope.trasii2.facter) {
                TrasiiCRUDService.addTrasii($scope.trasii2)
                    .then (function success(response){
                            $scope.message = 'Trasii added!';
                            $scope.errorMessage = '';
                        },
                        function error(response){
                            $scope.errorMessage = 'Error adding Trasii!';
                            $scope.message = '';
                        });
            }
            else {
                $scope.errorMessage = 'Please enter required data!';
                $scope.message = '';
            }
        };
         */
        /*
        $scope.deleteTrasii = function (selectedRow) {
            TrasiiCRUDService.deleteTrasii(selectedRow)
                .then (function success(response) {
                        $scope.message = 'Trasii deleted!';
                        $scope.Trasii = null;
                        $scope.errorMessage='';
                    },
                    function error(response) {
                        $scope.errorMessage = 'Error deleting Trasii!';
                        $scope.message='';
                    });
        };*/
    }]);