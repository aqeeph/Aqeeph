
<!-- Load Facebook SDK for JavaScript -->
      <div id="fb-root"></div>
      <script>
        window.fbAsyncInit = function() {
          FB.init({
            xfbml            : true,
            version          : 'v9.0'
          });
        };

        (function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = 'https://connect.facebook.net/tr_TR/sdk/xfbml.customerchat.js';
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));</script>

      <!-- Your Chat Plugin code -->
      <div class="fb-customerchat"
        attribution=setup_tool
        page_id="100178018697531"
  logged_in_greeting="Merhaba 👋 . Nasıl yardımcı olabiliriz ? "
  logged_out_greeting="Merhaba 👋 . Nasıl yardımcı olabiliriz ? ">
# Proje amaçları
Geliştirmiş olduğum tüm projeleri bu proje altında toplama,
Geliştirmiş olduğum kodlardan kütüphane oluşturma
Yazmaya çalışmış olduğum kod başka bir projede yazılmış olabileceğinden gereksiz yere farklı projelerde aynın kodları yazmanın önüne geçme
Tüm projelerde refaktoring yaparak proje içerisinde gereksiz yere kod tekrarını önleme
Proje yedeklemelerini düzenleme
Proje bağımlılıklarının global olarak bulunabilir ve de güncellenebilir olması için maven projeleri oluşturma
Versiyon kontrol işlemleri yapma
Donanımsal sorunlara karşı internet üzerinde yedekleme yapma
Bilgilerin yanlışlıkla veya sabotaj sonrası silinme ihtimaline binaen yedekleme yapma


