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
	