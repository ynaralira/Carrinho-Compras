<!-- arquivo carrinho.jsp -->
<%@ page import="java.util.*"%>
<html>
<body>
<center>
<div style="">
<h2 style="color:blue;align-items:center;"><img src="https://cdn-icons-png.flaticon.com/512/6644/6644893.png" style="width: 30px;">  Lista de compras</h2>
<center><ul style="list-style:none;border:5px solid blue;width:300px;">

<li>
	<%
	List produtos = (List) request .getAttribute("produtos"); 
	for (int i = 0; i < produtos.size(); i++) {
		out.println("<p> " + produtos.get(i) + " <p/>"); 
	}  
	%>
</li>
</ul>
</div>
	</center>
	
</body>
</html>
