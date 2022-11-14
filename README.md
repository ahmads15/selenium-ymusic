# selenium-ymusic

Yang diperlukan sebelum running automation:
- Chrome driver version 102 karena menggunakan chromedrive 102
- Install java jdk, maven dll


  Cara running automation : 
- Buka file TestRunner (src->test->java->StepDef->TestRunner)
- Lalu Runner menggunakan TestRunner
- pada default tags = "@Test_2" akan running tc dengan tags tersebut.
  untuk menjalankan testcases lain hanya perlu ubah tagsnya saja sesuai
  testcases dicucumber file
- Untuk melihat hasil reporting -> target lalu open folder cucumber-report-html
  buka Test_2.html (bila running dengan tags tersebut)
- Pastikan setelah run automation jalankan command "mvn clean verify" untuk 
 generated cucumber reportnya
    


  