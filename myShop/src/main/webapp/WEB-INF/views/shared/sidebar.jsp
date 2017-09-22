<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p class="lead">Nos Categorie</p>
<div class="list-group">

<c:forEach items="${categories}" var="categorie">
	
			<a href="${contextRoot}/show/category/${categorie.id_categorie}/véhicule" 
			class="list-group-item" 
			id="a_${categorie.nom_cat}">${categorie.nom_cat}</a>
</c:forEach>
</div>