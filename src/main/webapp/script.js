var ticking = setInterval(time, 1000);
var adding;

function time() {
	document.getElementById("timeP").innerHTML = new Date();
}

function showHideDiv(id) {
	var obj = document.getElementById(id);
	if (obj.style.display == "none") {
		obj.style.display = 'block';
	} else if (obj.style.display == "block") {
		obj.style.display = 'none';
	}
}

function showAction(id) {
	var obj1 = document.getElementById(id);
	if (obj1.style.display == "none") {
		obj1.style.display = 'block';
	} else if (obj1.style.display == "block") {
		obj1.style.display = 'none';
	}
}
