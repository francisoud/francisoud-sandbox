
// Ideoproject Indicateurs Textarea
// version 0.1 BETA!
// 2010-03-10
//
// ==UserScript==
// @name          Ideoproject Indicateurs Textarea
// @namespace     http://sqli.ideoproject.com/
// @description   add indicateurs template to textareas
// @include       *
// ==/UserScript==

var textareas, textarea;

textareas = document.getElementsByTagName('textarea');
if (!textareas.length) { return; }

function textarea_indicateur(event) {
    var link, textareas, textarea, name;
    link = event.currentTarget;
    name = link.getAttribute('_textarea_target');
    textareas = document.getElementsByName(name);
    for (var i = 0; i < textareas.length; i++) {
      textarea = textareas[i];
      console.debug(textarea.name);
      textarea.value += '<b>Analyse: </b>xxx\n\n<b>Seuil: </b>xxx\n\n<b>Actions: </b>\n';
    }
//    event.preventDefault();
}

function createButton(target, func, title, width, height, src) {
    var img, button;
    img = document.createElement('img');
    img.width = width;
    img.height = height;
    img.style.borderTop = img.style.borderLeft = "1px solid #ccc";
    img.style.borderRight = img.style.borderBottom = "1px solid #888";
    img.style.marginRight = "2px";
    img.src = src;
    button = document.createElement('a');
    // button._target = target;
    button.setAttribute('_textarea_target', target.name);
    button.title = title;
    button.href = '#';
    button.addEventListener("click", func, true);
    // button.onclick = func; 
    button.appendChild(img);
    return button;
}

for (var i = 0; i < textareas.length; i++) {
    textarea = textareas[i];
    console.debug(textarea.name);
    var button = createButton(
            textarea,
            textarea_indicateur,
            'Ajout du template indicateurs',
            12,12, 'http://sqli.ideoproject.com/img/pic_dup.png');
    textarea.parentNode.insertBefore(button ,textarea);
}
//
// ChangeLog
// 2010-03-10 - 0.1 - MAP - initial code
//
