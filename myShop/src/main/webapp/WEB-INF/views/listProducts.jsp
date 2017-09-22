<div class="container">

	<div class="row">

		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-md-9">

			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllVehicules == true}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Tous Nos véhicule</li>


						</ol>
					</c:if>


					<c:if test="${userClickCategorieVehicules == true}">
						<script>
							window.categoryId = '${categorie.id_categorie}';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">categorie</li>
							<li class="active">${categorie.nom_cat}</li>


						</ol>
					</c:if>


				</div>


			</div>


		</div>



	</div>






</div>