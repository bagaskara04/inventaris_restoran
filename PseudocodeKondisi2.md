Algoritma: Total_Kerugian_Produk_Kadaluarsa

Deklarasi:
jmlSnack, jmlMnmKaleng : int
totalSnack, totalMnmKaleng, harga, kerugian : double

Deskripsi:
1. print "Masukkan jumlah snack yang kadaluarsa"
2. read jmlSnack
3. print "Masukkan harga snack"
4. read harga
5. totalSnack = jmlSnack * harga
6. print "Total kerugian snack kadaluarsa adalah " + totalSnack
7. print "Masukkan jumlah mnmKaleng yang kadaluarsa"
8. read jmlMnmKaleng
9. print "Masukkan harga mnmKaleng"
10. read harga
11. totalMnmKaleng = jmlSnack * harga
12. print "Total kerugian minuman kaleng kadaluarsa adalah " + totalMnmKaleng
13. kerugian = totalSnack + totalMnmKaleng
14. print "Kerugian Bulan Oktober sebesar Rp. " + kerugian