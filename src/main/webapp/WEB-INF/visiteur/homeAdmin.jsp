<c:import url="header.jsp"></c:import>
	<h1>Liste des visiteurs</h1>
	
	<div id="mesDeuxTables">

	<%--TABLEAU MAJEUR --%>
	<div id="tableMajeur">
	<h2>Liste visiteurs majeurs</h2>
	<table>
		<thead>
			<tr>
				<th scope="col">&nbsp;</th>
				<th scope="col">Nom</th>
				<th scope="col">Prénom</th>
				<th scope="col">Age</th>
				<th scope="col">Boissons préférées</th>
				<th scope="col">A voté ?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${majeurs}" var="majeur">		
				<tr>
					<th><input type="checkbox"></th>
					<td >${majeur.nom}</td>
					<td>${majeur.prenom }</td>
					<td>${majeur.age }</td>
					<td>${majeur.boissons }</td>
					<td>${majeur.vote }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<%--TABLEAU MINEUR --%>
	<div id="tableMineur">
	<h2>Liste visiteurs mineurs</h2>
	<table id="tableMajeur">
		<thead>
			<tr>
				<th scope="col">&nbsp;</th>
				<th scope="col">Nom</th>
				<th scope="col">Prénom</th>
				<th scope="col">Age</th>
				<th scope="col">Cookies préférés</th>
				<th scope="col">Lait ?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${mineurs}" var="mineur">		
				<tr>
					<th><input type="checkbox"></th>
					<td >${mineur.nom}</td>
					<td>${mineur.prenom }</td>
					<td>${mineur.age }</td>
					<td>${mineur.cookies }</td>
					<td>${mineur.lait }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
</div>

<c:import url="footer.jsp"></c:import>
