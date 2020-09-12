//  event pada saat link
$('.page-scroll').on('click', function (e) {

    //  ambil isi href
    var tujuan = $(this).attr('href');
    // tangkap elem ybs
    var elemenTujuan = $(tujuan);


    // pindahkan scroll
    $('html,body').animate({
        scrollTop: elemenTujuan.offset().top - 50
    }, 1250, 'easeInOutExpo');

    e.preventDefault();

});



// parallax
// about

$(window).on('load', function () {
    $('.pKiri').addClass('pMuncul');
    $('.pKanan').addClass('pMuncul');
});



$(window).scroll(function () {
    var wScroll = $(this).scrollTop();

    //  jumbotron
    $('.jumbotron img').css({
        'transform': 'translate(0px, ' + wScroll / 4 + '%)'
    });

    $('.jumbotron h1').css({
        'transform': 'translate(0px, ' + wScroll / 2 + '%)'
    });

    $('.jumbotron p').css({
        'transform': 'translate(0px, ' + wScroll / 1.2 + '%)'
    });


    // isi
    if (wScroll > $('.isi').offset().top - 250) {
        $('.isi .thumbnail').each(function (i) {
            setTimeout(function () {
                $('.isi .thumbnail').eq(i).addClass('muncul');
            }, 300 * (i + 1));
        });
    }
});