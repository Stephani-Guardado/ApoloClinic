var openPopUp = document.getElementById('btnOpenPopUp'),
	overlay = document.getElementById('overlay'),
	popUp = document.getElementById('popUp'),
	closePopUp = document.getElementById('btnClosePopUp'),
	btnCancel = document.getElementById('btnCancel');

	openPopUp.addEventListener('click', function(){
		overlay.classList.add('Active');
		popUp.classList.add('Active');
		document.body.style.overflow = 'hidden';
	});

	closePopUp.addEventListener('click', function(){
		overlay.classList.remove('Active');
		popUp.classList.remove('Active');
		document.body.style.overflow = 'auto';
		document.body.style.overflowX = 'hidden';
	});

	btnCancel.addEventListener('click', function(){
		overlay.classList.remove('Active');
		popUp.classList.remove('Active');
		document.body.style.overflow = 'auto';
		document.body.style.overflowX = 'hidden';
	});
	
	var openPopUp2 = document.getElementById('btnOpenPopUp2'),
	overlay2 = document.getElementById('overlay2'),
	popUp2 = document.getElementById('popUp2'),
	closePopUp2 = document.getElementById('btnClosePopUp2'),
	btnCancel2 = document.getElementById('btnCancel2');

	openPopUp2.addEventListener('click', function(){
		overlay2.classList.add('Active');
		popUp2.classList.add('Active');
		document.body.style.overflow = 'hidden';
	});

	closePopUp2.addEventListener('click', function(){
		overlay2.classList.remove('Active');
		popUp2.classList.remove('Active');
		document.body.style.overflow = 'auto';
	});

	btnCancel2.addEventListener('click', function(){
		overlay2.classList.remove('Active');
		popUp2.classList.remove('Active');
		document.body.style.overflow = 'auto';
	});