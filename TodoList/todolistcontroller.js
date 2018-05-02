angular.module('TodoListApp', [])
   .controller('TodoListController', function($scope) {
	   $scope.todos = [];
	   $scope.todoText = '';
	   
	   $scope.addToDo = function () {
			if ($scope.todoText.trim() != '') {
				$scope.todos.push({text: $scope.todoText, selected: false});
				$scope.todoText = '';
			}
		};
  
		$scope.clearText = function () {
			$scope.todoText = '';
		};
		
		$scope.selectAll = function() {
			for (var i = 0; i < $scope.todos.length; i++) {
				$scope.todos[i].selected = true;
			}
		};
		
		$scope.deleteItems = function() {
			$scope.todos = $scope.todos.filter(function(todo){
				return !todo.selected;
			});
			
		};
		
		$scope.hasSelected = function() {
			return $scope.todos.filter(function(todo){
				return todo.selected;
			}).length > 0;
		}
		
		$scope.hasItem = function() {
			return $scope.todos.length > 0;
		};
	}).directive('ngEnter', function () { //a directive to 'enter key press' in elements with the "ng-enter" attribute

        return function (scope, element, attrs) {

            element.bind("keydown keypress", function (event) {
                if (event.which === 13) {
                    scope.$apply(function () {
                        scope.$eval(attrs.ngEnter);
                    });

                    event.preventDefault();
                }
            });
        };
    });