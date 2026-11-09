# Rapor

**Ad Soyad:** Betül Beril Yücel
**Numara:** 684

## 1. Problemin Açıklaması
<!-- Problemi kendi cümlelerinizle yazın. --> asansör kat problemi


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- mevcut kat ve hedef kat

**İşlemler:**
- mevcut kat ile hedef katı karşılaştırdı ve hedef kattan mevcut katı çıkardı

**Çıktılar:**
- yukarı yada aşağı gideceğini ve kaç kat gideceğini söyledi

## 3. Sözde Kod (Pseudocode)

```
1.mkat oku hkat oku
2.karşılaştır ve farkı bul
3.sonucu yaz
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı |5 kat yukarı| doğru |
| 9 | 2 | 7 kat aşağı |aşağı -7 kat|doğru|
| 5 | 5 | Hareket yok |aynı kattasınız|doğru|
| 1 | 10 | 9 kat yukarı |9 kat yukarı | doğru|
| 10 | 1 | 9 kat aşağı |-9 kat aşağı |doğru |
| 0 | 5 | Geçersiz mevcut kat |geçersiz |kısmen doğru(çünkü hala -5 diyo) |
| 5 | 11 | Geçersiz hedef kat |geçersiz |kısmen doğru(hala+6 kat diyo) |
| -2 | 4 | Geçersiz mevcut kat |geçersiz |kısmen doğru(hala+6 diyo) |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

