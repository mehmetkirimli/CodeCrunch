# CodeCrunch-Java-Performance-Lab
A Java-based performance benchmarking and optimization experiment focusing on CPU, RAM, and Disk efficiency.

 # Deney Planı
1️⃣ Bir Java uygulaması geliştireceğiz ve optimize edilmemiş haliyle CPU, RAM ve Disk kullanımını ölçeceğiz.
2️⃣ Kodda optimizasyon tekniklerini uygulayacağız.
3️⃣ Tekrar test edip önceki raporlarla kıyaslayacağız.

Uygulamada Yapacağımız Testler
🔹 CPU Testi:
Büyük sayılarla faktöriyel hesaplama
Büyük koleksiyonlar üzerinde gereksiz döngüler

🔹 RAM Testi:
Büyük liste ve nesneler oluşturma
Bellek sızıntısı yaratma (Unmanaged Collection Usage)

🔹 Disk Testi:
Çok sayıda dosya oluşturma ve silme
Büyük boyutlu dosya okuma/yazma
İlk Aşamada Kullanacağımız Araçlar

📌 Java Profiling Araçları:
VisualVM: JVM süreçlerini analiz etmek için
JProfiler / YourKit: Bellek ve CPU kullanımı için
IntelliJ Profiler: Kodun hangi bölümleri en fazla CPU tüketiyor

📌 Performans Ölçüm Teknikleri:
System.nanoTime() / System.currentTimeMillis()
JConsole ile heap ve garbage collector analizi

Optimizasyon Sonrası Yapılacaklar
✅ CPU için: Multithreading, gereksiz hesaplamaları azaltma
✅ RAM için: Nesne yeniden kullanımını artırma, gereksiz nesneleri ortadan kaldırma
✅ Disk için: Dosya işlemlerini asenkron hale getirme 
