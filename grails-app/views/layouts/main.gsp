<!DOCTYPE html>
<html>
    <head>

        <title><g:layoutTitle default="Grails" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />

		<!-- Core CSS - Include with every page -->
		<link href="${resource(dir:'css',file:'bootstrap.min.css')}" rel="stylesheet">
		<link href="${resource(dir:'font-awesome/css',file:'font-awesome.css')}" rel="stylesheet">

		<!-- Page-Level Plugin CSS - Morris -->
		<link href="${resource(dir:'css/plugins/morris',file:'morris-0.4.3.min.css')}" rel="stylesheet">

		<!-- SB Admin CSS - Include with every page -->
		<link href="${resource(dir:'css',file:'sb-admin.css')}" rel="stylesheet">
		<link href="${resource(dir:'css',file:'style.css')}" rel="stylesheet">

        <g:layoutHead />
        <g:javascript library="application" />
    </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${resource(dir:'images',file:'spinner.gif')}" alt="${message(code:'spinner.alt',default:'Loading...')}" />
        </div>
        <div id="grailsLogo"><a href="http://grails.org"><img src="${resource(dir:'images',file:'grails_logo.png')}" alt="Grails" border="0" /></a></div>
        <g:layoutBody />
    </body>
</html>
