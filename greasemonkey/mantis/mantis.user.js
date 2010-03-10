// ==UserScript==
// @name           Mantis
// @namespace      mantis.sqli.ideoproject.com
// @description    Script to make mantis 'almost' beautiful
// @include        http://sqli.ideoproject.com/mantis/*
// ==/UserScript==

// alert('getElmts');

var rows = document.getElementById('buglist').rows;
var i = 0;
for (i = 0; i <= rows.length; i++) {
    // rows[i].style.display='none';
    rows[i].style.background='#DDDDDD';
    // alert((rows[i]).bgcolor);
}
// alert('end');
