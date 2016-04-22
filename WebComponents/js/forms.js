
function getToken() {
	var params = $('#tokenForm').serialize();
	$.post('https://accounts.google.com/o/oauth2/token', params, function(data) {
		alert(data.access_token);
	}, "json");
}