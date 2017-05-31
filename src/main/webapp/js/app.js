var app = angular.module('app', ['ngAnimate', 'ngSanitize', 'ui.bootstrap']);

app.service('TrasiiCRUDService', [ '$http', function($http) {

    this.getTrasii = function getTrasii(trasii){
        return $http({
            method : 'GET',
            url : '/trasii/'+trasii.id.compaak+'/'+trasii.id.empresa+'/'+trasii.id.ejercio+'/'+trasii.id.periodo+'/'+trasii.id.eminif+'/'+trasii.id.facnum+'/'+trasii.id.facfec+'/'+trasii.id.facter,
        });
    }

    this.addTrasii = function addTrasii(trasii){
        return $http({
            method : 'POST',
            url : '/trasii',
            data : {
                trasii
            }
        });
    }

    this.updateTrasii = function updateTrasii(trasii2){
        return $http({
            method : 'POST',
            url : '/trasii/'+trasii2.compaak+'/'+trasii2.empresa+'/'+trasii2.ejercio+'/'+trasii2.periodo+'/'+trasii2.eminif+'/'+trasii2.facnum+'/'+trasii2.facfec+'/'+trasii2.facter,
            data : {
                trasii2
            }
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


    this.deleteTrasii = function deleteTrasii(trasii2) {
        return $http({
            method : 'DELETE',
            url : '/trasii/'+trasii2.compaak+'/'+trasii2.empresa+'/'+trasii2.ejercio+'/'+trasii2.periodo+'/'+trasii2.eminif+'/'+trasii2.facnum+'/'+trasii2.facfec+'/'+trasii2.facter,
        })
    }

    this.getAllTrasii = function getAllTrasii() {
        return $http({
            method : 'GET',
            url : '/trasii'
        });
    }

}
]);

app.controller('TrasiiCRUDCtrl', ['$scope','TrasiiCRUDService', '$uibModal', '$log',
    function ($scope, TrasiiCRUDService, $uibModal, $log) {

        var setOfKeys = new StringSet();
        $scope.totalItems = 0;
        $scope.currentPage = 1;
        $scope.itemsPerPage = 50;
        $scope.itemsToShow;
        $scope.rowIndex = -1;

        $scope.setPage = function (pageNo) {
            $scope.currentPage = pageNo;
        };

        $scope.pageChanged = function() {
            var offset = ($scope.currentPage - 1) * $scope.itemsPerPage; //itemsPage;// + 1;
            var to = offset + $scope.itemsPerPage;
            $scope.itemsToShow = $scope.trasii2.slice(offset,to);
            $log.log('Showing items -> From: ' + offset + ' To: ' + to);

        };

        $scope.isRowSelected = [];

        $scope.setSelected = function(tra,facnum) {

            $scope.isRowSelected[facnum] = ( $scope.isRowSelected[facnum] === undefined || $scope.isRowSelected[facnum] === false ) ? true : false;
            var keyRow = tra.id.compaak.concat("||").concat(tra.id.empresa).concat("||").concat(tra.id.ejercio).concat("||").concat(tra.id.periodo).concat("||").concat(tra.id.eminif).concat("||").concat(tra.id.facnum).concat("||").concat(tra.id.facfec).concat("||").concat(tra.id.facter);

            if(setOfKeys.contains(keyRow)){
                setOfKeys.remove(keyRow);
            }else{
                setOfKeys.add(keyRow);
            }
            console.log(setOfKeys.values());
        };

        $scope.procesarRegistros = function(){
            if(setOfKeys.values().length > 0){
                TrasiiCRUDService.procesarRegistros(setOfKeys.values())
                    .then(function success(response) {
                            $scope.trasii2 = response.data
                            $scope.totalItems = $scope.trasii2.length
                            $scope.itemsToShow = $scope.trasii2.slice(0, $scope.itemsPerPage);
                            $scope.currentPage = 1;
                            $scope.message = '';
                            $scope.errorMessage = '';
                            $scope.isRowSelected = []
                            setOfKeys.clear();
                    },
                    function error(response) {
                        $scope.message = '';
                        $scope.errorMessage = 'Error procesando registros Trasii!';
                    });
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

        $scope.dataForModal = {
            name: 'NameToEdit',
            value: 'ValueToEdit'
        }
        $scope.open = function() {
            $uibModal.open({
                component: "myModal",
                resolve: {
                    modalData: function() {
                        return $scope.dataForModal;
                    }
                }
            }).result.then(function(result) {
                console.info("I was closed, so do what I need to do myContent's controller now.  Result was->");
                console.info(result);
            }, function(reason) {
                console.info("I was dimissed, so do what I need to do myContent's controller now.  Reason was->" + reason);
            });
        };

        $scope.getAllTrasii = function () {
            TrasiiCRUDService.getAllTrasii()
                .then(function success(response) {
                        $scope.trasii2 = response.data//._embedded.trasii;
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
        };*/

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

app.component('myModal', {
    templateUrl : '../partial-views/editing-form.html',
    bindings: {
        modalInstance: "<",
        resolve: "<"
    },
    controller: [function() {
        var $ctrl = this;

        $ctrl.$init = function() {
            $ctrl.modalData = $ctrl.resolve.modalData;
        }

        $ctrl.handleClose = function() {
            console.info("in handle close");
            $ctrl.modalInstance.close($ctrl.modalData);
        };

        $ctrl.handleDismiss = function() {
            console.info("in handle dismiss");
            $ctrl.modalInstance.dismiss("cancel");
        };
    }]
});
