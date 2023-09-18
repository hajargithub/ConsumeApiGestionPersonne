<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <div class="table-responsive">
        <table class="table app-table-hover mb-0 text-center">
            <thead>
                <tr>
                    <th class="cell">Id</th>
                    <th class="cell">Nom</th>
                    <th class="cell">Prenom</th>
                    <th class="cell">Age</th>
                    <th class="cell">DateNainance</th>
                    <th class="cell">Action 1</th>
                    <th class="cell">Action 2</th>
                    <th class="cell">Action 3</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="e" items="${listP}">
                    <tr>
                        <td class="cell">${e.id}</td>
                        <td class="cell"><span class="truncate">${e.nom}</span></td>
                        <td class="cell"><span class="truncate">${e.prenom}</span></td>
                        <td class="cell"><span class="truncate">${e.age }</span></td>
                        <td class="cell"><span class="truncate">${e.dateNaissance}</span></td>
<!--                         envoyer id comme param
 -->                        
 <td class="cell"><a href="supprimer?id=${e.id}">Supprimer</a></td>
<!--  envoyer id en path
 -->                        
 <td class="cell"><a href="supprimer2/${e.id}">Supprimer2</a></td>
 <td class="cell"><a href="modifier?id=${e.id}">Modifier</a></td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>
        
    </div>
    <!--//table-responsive-->
