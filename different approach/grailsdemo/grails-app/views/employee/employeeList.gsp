
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Employee List</title>
</head>
<body>



    <div class="container-fluid">
        <div class="row">
            <a href="${createLink(controller: 'employee', action: 'addEmployee')}" CLASS="btn btn-success">Add Employee</a>
        </div>

        <g:if test="${flash.message}">


            <div class="alert alert-success">
                <a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">&times;</a>

                ${flash.message}
            </div>

        </g:if>


        <div class="row table">
          <table class="table table-hover table-bordered">
              <tr>
                  <td>S.N</td>
                  <td>First Name</td>
                  <td>Middle Name</td>
                  <td>Last Name</td>
                  <td>Address</td>
                  <td>Department</td>
                  <td>Action</td>
              </tr>

              <g:each in="${employeeList}" status="i" var="e">
                  <tr>
                      <td>${i+1}</td>
                      <td>${e.firstname}</td>
                      <td>${e.middlename}</td>
                      <td>${e.lastname}</td>
                      <td>${e.address}</td>
                      <td>${e.department}</td>
                      <td>
                          <a href="${createLink(controller: 'employee', action: 'deleteEmployee',params: [id:e.id])}"
                             class="btn btn-danger" onclick="return confirm('Are you sure you want to delete?')">Delete</a>
                          <a href="${createLink(controller: 'employee', action: 'updateEmployee',params: [id:e.id])}"
                              class="btn btn-success">Update</a>
                      </td>
                  </tr>

              </g:each>

          </table>

        </div>
    </div>



</body>

</html>