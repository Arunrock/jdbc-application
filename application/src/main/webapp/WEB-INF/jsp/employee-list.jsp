 
<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
<div class="container">
  <table class="table table-striped">
<caption>Employee Details</caption>
<thread>
<tr>
<th> Employee_Id</th>
<th>Name</th>
<th>Designation</th>
<th>Salary </th>
<th>Dateofbirth</th>
<th>Manager_name</th>
<th>Manager_id</th>
<th></th>
<th></th>
<th></th>

</tr>
</thread>
<tbody>

<c:forEach items="${employees}" var="employee">
      <tr>
           <td>${employee.emp_Id }</td> 
         <td>${employee.name}</td>
         <td>${employee.designation}</td>
         <td>${employee.salary}</td>
         <td><fmt:formatDate value ="${employee.dob}" pattern="yyyy/mm/dd"/></td> 
         <td>${employee.manger_name}</td>
         <td>${employee.manager_id}</td>
         <td><a type="button" class="btn btn-success" method="post" href="/update-employee?id=${employee.emp_Id}">Update</a></td>
         <td><a type="button" class="btn btn-warning" href="/delete-employee?id=${employee.emp_Id}">Delete</a></td>
         <td><a type="button" class="btn btn-success" href="/employee?id=${employee.emp_Id}">GetbyId</a></td>
    </tr> 
</c:forEach>

               
</tbody>
</table> 
<div><a class="button" href="/addemployee">ADD a employeedetail</a></div>


<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>		
</body>
</html>