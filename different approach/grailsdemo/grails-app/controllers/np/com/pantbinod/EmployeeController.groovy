package np.com.pantbinod

class EmployeeController {

    def employeeService

    def index() { }


    def employeeList(){

        def employeeList = employeeService.employeeList()
        println employeeList.each {
            it -> println it
        }
        [employeeList : employeeList]
    }

    def addEmployee(){ }


    def save(){

        employeeService.saveEmployee(params)
        flash.message="Sucessfully Saved."
        redirect(action: 'employeeList')
    }

    def update(){
        employeeService.saveEmployee(params)
        flash.message="Sucessfully Updated.."
        redirect(action: 'employeeList')
    }

    def deleteEmployee(){
        employeeService.deleteEmployee(params.long('id'))
        redirect(controller: 'employee', action: 'employeeList')
    }

    def updateEmployee(){
        Employee employee = employeeService.getEmployee(params.long('id'))
        [employee :employee]
    }

}
