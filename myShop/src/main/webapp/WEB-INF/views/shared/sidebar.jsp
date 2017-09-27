<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p class="lead">Nos Categories</p>
<div class="list-group">

<c:forEach items="${categories}" var="category">
	
			<a href="${contextRoot}/show/category/${category.id_categorie}/products" 
			class="list-group-item" 
			id="a_${category.nom_cat}">${category.nom_cat}</a>
</c:forEach>
</div>