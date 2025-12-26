## Petstore API Test (REST-Assured)

Bu projede Swagger Petstore API kullanılarak REST-Assured ile POST /pet endpoint’i test edilmiştir.

## Kullanılan Teknolojiler
- Java
- REST-Assured
- TestNG
- Maven

## Test Senaryosu
- Request body POJO kullanılarak oluşturulmuştur
- Testler given / when / then zincirli yapı ile yazılmıştır
- Yanıtın 200 döndüğü doğrulanmıştır
- Oluşturulan pet için:
    - id alanının boş olmadığı
    - name ve status alanlarının gönderilen değerlerle aynı olduğu kontrol edilmiştir


## Proje Yapısı
src   

├─ main/java/model/Pet.java

└─ test/java/api/PetApiTest.java

## Çalıştırma
Testler IDE üzerinden veya Maven ile çalıştırılabilir.
