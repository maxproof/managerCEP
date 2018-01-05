<%@ include file="header.jsp"%>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<script  type="text/javascript">
jQuery(document).ready(function($) {

	if (window.history && window.history.pushState) {

	window.history.pushState('forward', null, null);

	$(window).on('popstate', function() {
	window.location.href = "/managerCEP/";
	});

	}
	});
</script>
<style>
#container
{
    background: #fff;
    border-radius: 15px;
    height: 590px;
    margin: 20px 20px;
    overflow: hidden;
    width: 600px;
    margin-left: auto;
    margin-right: auto;
    /* this fixes the overflow:hidden in Chrome/Opera */
    -webkit-mask-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAIAAACQd1PeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAA5JREFUeNpiYGBgAAgwAAAEAAGbA+oJAAAAAElFTkSuQmCC);
}
</style>
<div class="main">
	<h4>Home :: Manager CEP</h4>
	<p>Bienvenue <b>${pageContext.request.userPrincipal.name}</b> <!--(id session = <%//out.print(session.getId());%>) 	(<%//long time = session.getCreationTime(); out.print("creation session time = "+time);%>)--></p>
	<!--p><sec:authentication property="principal.username"/></p-->
	<!--p>${authentication.getPrincipal().getUserCep().getUserCepFirstName()}</p-->
	<%//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	//String currentPrincipalName = authentication.getName(); out.print("NOM"+currentPrincipalName);%>
	<!--<security:authorize access="isAuthenticated()">
    	authenticated as <security:authentication property="principal.username" /> 
	</security:authorize>-->
	<p>
	</p>
	<!--p align="center">
		<img src="resources/img/cep.jpg" class="img-rounded" alt="CEP"
			width="504" height="436">
	</p-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/processing.js/1.6.4/processing.min.js"></script>
<script type="text/processing" data-processing-target="processing-canvas">
int Nmax = 1000 ; float M = 50 ; float H = 0.99 ; float HH = 0.01 ;
float X[] = new float[Nmax+1] ; float Y[] = new float[Nmax+1] ; float Z[] = new float[Nmax+1] ;
float V[] = new float[Nmax+1] ; float dV[] = new float[Nmax+1] ; 
float L ; float R = 2*sqrt((4*PI*(200*200)/Nmax)/(2*sqrt(3))) ;
float Lmin ; int N ; int NN ; 
float KX ; float KY ; float KZ ; 
float KV ; float KdV ; int K ;

void setup(){
  size(650,650) ;
  background(0,32,128) ;
  noSmooth() ;
  stroke(255,255,255) ;
  fill(50,50,50) ;
  for ( N = 0 ; N <= Nmax ; N++ ){
    X[N] = random(-300,+300) ;
    Y[N] = random(-300,+300) ;
    Z[N] = random(-300,+300) ;
  }
} // setup()

void draw(){
  background(0,32,128) ;
  for ( N = 0 ; N <= Nmax ; N++ ){
     for ( NN = N+1 ; NN <= Nmax ; NN++ ){
        L = sqrt(((X[N]-X[NN])*(X[N]-X[NN]))+((Y[N]-Y[NN])*(Y[N]-Y[NN]))) ;
        L = sqrt(((Z[N]-Z[NN])*(Z[N]-Z[NN]))+(L*L)) ;
        if ( L < R ){
          X[N] = X[N] - ((X[NN]-X[N])*((R-L)/(2*L))) ;
          Y[N] = Y[N] - ((Y[NN]-Y[N])*((R-L)/(2*L))) ;
          Z[N] = Z[N] - ((Z[NN]-Z[N])*((R-L)/(2*L))) ;
          X[NN] = X[NN] + ((X[NN]-X[N])*((R-L)/(2*L))) ;
          Y[NN] = Y[NN] + ((Y[NN]-Y[N])*((R-L)/(2*L))) ;
          Z[NN] = Z[NN] + ((Z[NN]-Z[N])*((R-L)/(2*L))) ;
          dV[N] = dV[N] + ((V[NN]-V[N])/M) ;
          dV[NN] = dV[NN] - ((V[NN]-V[N])/M) ;
          stroke(125+(Z[N]/2),125+(Z[N]/2),125+(Z[N]/2)) ; 
          line(X[N]*1.2*(200+V[N])/200+300,Y[N]*1.2*(200+V[N])/200+300,X[NN]*1.2*(200+V[NN])/200+300,Y[NN]*1.2*(200+V[NN])/200+300) ; 
        }
        if ( Z[N] > Z[NN] ){
          KX = X[N] ; KY = Y[N] ; KZ = Z[N] ; KV = V[N] ; KdV = dV[N] ; 
          X[N] = X[NN] ; Y[N] = Y[NN] ; Z[N] = Z[NN] ; V[N] = V[NN] ; dV[N] = dV[NN] ;  
          X[NN] = KX ; Y[NN] = KY ; Z[NN] = KZ ; V[NN] = KV ; dV[NN] = KdV ; 
        }
     }
     L = sqrt((X[N]*X[N])+(Y[N]*Y[N])) ;
     L = sqrt((Z[N]*Z[N])+(L*L)) ;
     X[N] = X[N] + (X[N]*(200-L)/(2*L)) ;
     Y[N] = Y[N] + (Y[N]*(200-L)/(2*L)) ;
     Z[N] = Z[N] + (Z[N]*(200-L)/(2*L)) ;
     KZ = Z[N] ; KX = X[N] ;
     Z[N] = (KZ*cos(float(300-mouseX)/10000))-(KX*sin(float(300-mouseX)/10000)) ;
     X[N] = (KZ*sin(float(300-mouseX)/10000))+(KX*cos(float(300-mouseX)/10000)) ;
     KZ = Z[N] ; KY = Y[N] ;
     Z[N] = (KZ*cos(float(300-mouseY)/10000))-(KY*sin(float(300-mouseY)/10000)) ;
     Y[N] = (KZ*sin(float(300-mouseY)/10000))+(KY*cos(float(300-mouseY)/10000)) ;
     dV[N] = dV[N] - (V[N]*HH) ; 
     V[N] = V[N] + dV[N] ; dV[N] = dV[N] * H ;
  }
    
} // draw() 

void mousePressed(){
  Lmin = 600 ; NN = 0 ;
  for ( N = 0 ; N <= Nmax ; N++ ){
     L = sqrt(((mouseX-(300+X[N]))*(mouseX-(300+X[N])))+((mouseY-(300+Y[N]))*(mouseY-(300+Y[N])))) ;
     if ( Z[N] > 0 && L < Lmin ){ NN = N ; Lmin = L ; }
  }
  if ( K == 0 ){ dV[NN] = -200 ; K = 1 ; }
           else{ dV[NN] = +200 ; K = 0 ; } 
     
} // mousePressed()
 </script>
 <div align="center" id="container">
 <canvas id="processing-canvas"></canvas>
 </div>
	
</div>
<!--p>${pageContext.request.remoteUser}</p-->
<%@ include file="footer.jsp"%>