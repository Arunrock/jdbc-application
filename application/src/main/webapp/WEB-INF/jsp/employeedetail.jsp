<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
<div class="container">

<form:form method ="post" modelAttribute="employee">

             <fieldset class="form-group">
             <form:label path="Emp_Id">Emp_Id</form:label>
            <form:input  path="Emp_Id" type="number" class="form-control" required="required"/>
           <form:errors path="Emp_Id" cssClass="text-warning"> </form:errors>
            </fieldset>
            <fieldset class="form-group">
             <form:label path="name">Name</form:label>
            <form:input  path="name" type="text" class="form-control" required="required"/>
           <form:errors path="name" cssClass="text-warning"> </form:errors>
            </fieldset>
             <fieldset class="form-group">
             <form:label path="Designation">designation</form:label>
            <form:input  path="Designation" type="text" class="form-control" required="required"/>
           <form:errors path="Designation" cssClass="text-warning"> </form:errors>
            </fieldset>
            <fieldset class="form-group">
             <form:label path="salary">Salary</form:label>
            <form:input  path="salary" type="number" class="form-control" required="required"/>
           <form:errors path="salary" cssClass="text-warning"> </form:errors>
            </fieldset>
             <fieldset class="form-group">
             <form:label path="dob">DateofBirth</form:label>
            <form:input  path="dob" type="date"  placeholder="YYYY-MM-DD" format="yyyy-mm-dd" class="form-control" required="required"/>
          
           <form:errors path="dob" cssClass="text-warning"> </form:errors>
            </fieldset>
            <fieldset class="form-group">
             <form:label path="Manger_name">Manager_Name</form:label>
            <form:input  path="Manger_name" type="text" class="form-control" required="required"/>
           <form:errors path="Manger_name" cssClass="text-warning"> </form:errors>
            </fieldset>
            <fieldset class="form-group">
             <form:label path="manager_id">Manager_id</form:label>
            <form:input  path="manager_id" type="number" class="form-control" required="required"/>
           <form:errors path="manager_id" cssClass="text-warning"> </form:errors>
            </fieldset>
<input type="submit" class="btn btn-success"/>
</form:form>
</div>
<%@include file="common/footer.jspf" %>