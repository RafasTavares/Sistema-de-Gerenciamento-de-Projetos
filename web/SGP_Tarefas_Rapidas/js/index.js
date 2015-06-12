$(document)
  .on('click', '.task', function() {
    toggleTask($(this));
  })
  .on('mouseenter', '.task', function () {
    $('.close', $(this)).show();
  })
  .on('mouseleave', '.task', function () {
    $('.close', $(this)).hide();
  })
  .on('click', '.close', function (event) {
    event.stopPropagation();
    $(this).parent().hide('fade', 150, function() {
      $(this).remove();
    });
  });

$('.newtask input')
  .on('focus', function () {
    $(this).val('');
  })
  .on('blur', function () {
    $(this).val('Enter new task here');
  })
  .keypress(function(e) {
    if(e.which == 13) {
      newtask = $('<li class="task" style="display:none;"></li>'); 
      newtask.html($(this).val() + '<div class="close" style=display:none;"></div>');
      $('.newtask').before(newtask);
      newtask.show('fade', 250);
      $(this).val('');
    }
});

$('.reloader').on('click', function() {
  $('.task').hide('fade', 250, function() {
    remove();
  });
});

function toggleTask(task) {
  if(!task.hasClass('done')) {
    task.addClass('done');
  }
  else {
    task.removeClass('done');
  }
}