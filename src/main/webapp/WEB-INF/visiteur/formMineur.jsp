<c:import url="header.jsp"></c:import>

<form
	action="<%=request.getContextPath()%>/formMineur?mineur=<c:out value='${mineur.id_mineur }' />"
	method="post">
	
	<fieldset>
		<legend>*Champs requis</legend>
		<br> <label for="fnom" id="nom">Nom *:</label><br> <input
			type="text" name="nom" placeholder="nom" required><br>
		<br> <label for="prenom" id="lastname">Prenom *:</label><br>
		<input type="text" name="prenom" placeholder="prenom" required><br>
		<br> <label for="annee">Annee de naissance *:</label><br> <input
			type="text" name="annee" placeholder="-.-.-.-" required><br>
		<br>

		<div class="error"></div>
		<%-- s'affiche si erreur--%>
		<%-- if majeur --> formMajeur --%>
		<%-- if mineur --> suite form --%>

		<c:if test="${mineur.annee} < 2023 - ${mineur.annee}">
			<a href='<c:url value="/formMineur"/>'></a>
		</c:if>
		<c:if test="${mineur.annee} > 2023 - ${mineur.annee}">
 				Vous n'avez pas indiqué le bon âge
            	<a href='<c:url value="/"/>'>Retour à l'accueil</a>
		</c:if>

		<%-- COOKIE PREFERES --%>
		<label for="cookie">Ton cookie prefere ? </label><br>
		<br> <input type="checkbox" name="cookie">Double Chocolat
		<input type="checkbox" name="cookie">Pepite de chocolat <input
			type="checkbox" name="cookie">Sucre <input type="checkbox"
			name="cookie">Vanille<br>
		<br>

		<%-- LAIT --%>
		<label for="lait">preferez-vous boire vos biscuit avec du lait
			?</label><br>
		<br> <input type="radio" name="lait">Oui <input
			type="radio" name="lait">Non <input type="radio" name="lait">Seulement
		lait de soja <br>
		<br>

		<!--validation form-->
		<a id="btn" href="/" type="button"><button>valider</button></a>
	</fieldset>

</form>

<c:import url="footer.jsp"></c:import>