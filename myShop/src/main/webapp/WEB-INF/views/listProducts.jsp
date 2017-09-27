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

					<c:if test="${userClickAllProducts == true}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Tous Nos v�hicule</li>


						</ol>
					</c:if>


					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id_categorie}';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">categorie</li>
							<li class="active">${category.nom_cat}</li>


						</ol>
					</c:if>


				</div>


			</div>

			<div class="row">

				<div class="col-xs-12">


					<table id="productListTable"
						class="table table-striped table-borderd">


						<thead>

							<tr>
								<th></th>
								<th>Name</th>
								<th>Marque</th>
								<th>Prix</th>
								<th>Qty. Disponible</th>
								<th></th>

							</tr>

						</thead>


						<tfoot>

							<tr>
								<th></th>
								<th>Name</th>
								<th>Marque</th>
								<th>Prix</th>
								<th>Qty. Disponible</th>
								<th></th>

							</tr>

						</tfoot>
					</table>

				</div>

			</div>



		</div>


	</div>






</div>