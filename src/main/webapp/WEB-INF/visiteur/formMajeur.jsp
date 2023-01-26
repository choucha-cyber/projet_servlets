
<c:import url="header.jsp"></c:import>


<form action="<%=request.getContextPath()%>/formMajeur?majeur=<c:out value='${majeur.id_majeur }' />" method="post">
	<fieldset>
		<legend>*Champs requis</legend><br>
		 <label for="fnom" id="nom">Nom *:</label><br> 
		 <input type="text" name="nom" placeholder="nom" required><br><br>
			<label for="prenom" id="lastname">Prenom *:</label><br> 
			<input type="text" name="prenom" placeholder="prenom" required><br><br>
		 	<label for="annee">Annee de naissance *:</label><br> 
		 	<input type="text" name="annee" placeholder="__/__/__" required><br><br>
		
		<div class="error"></div> <%--si une erreur s'affiche afficher cette div OU... --%>

		<%-- CONDITIONS AGE --%>
		<%-- if mineur --> formMineur.jsp --%>
		<c:if test="${majeur.age} < 2023 - ${majeur.age}">
			<a href="/index"></a>
		</c:if>

		<%-- if majeur --> suite form visible --%>
		<<c:if test="${majeur.age} > 2023 - ${majeur.age}">
			<%--afficher suite FORM  <div suiteForm>--%>
		</c:if>

		<div id="suiteFormMajeur"> <%--doit s'afficher uniqement si majeur --%>
		<%-- TYPES ALCOOL PREFERES --%>
		<label for="alcool">Alcools préférés</label><br>
		 <input type="checkbox" name="alcool" id="biere" value="biere">Bière <br>
		 <input type="checkbox" name="alcool" id="vin" value="vin">Vin<br>
		 <input type="checkbox" name="alcool" id="rhum" value="rhum">Rhum<br>
		 <input type="checkbox" name="alcool" id="whisky" value="whisky">Whisky<br>

		<%-- VOTE ELECTION MUNICIPALE --%>
		<label for="vote">Avez-vous bien vote aux dernieres elections municipales ?</label><br>
		 <input type="radio" name="vote" id="oui" value="oui">Oui <br>
		 <input type="radio" name="vote" id="non" value="non">Non <br>
		 <input type="radio" name="vote" id="non" value="non">NSPR <br><%-- return non --%>
	
		<!--validation form-->
		<a href="/index"><button id="submit" onclick="valid()">valider</button></a>
		</div>
				
	</fieldset>

</form>

<c:import url="footer.jsp"></c:import>
