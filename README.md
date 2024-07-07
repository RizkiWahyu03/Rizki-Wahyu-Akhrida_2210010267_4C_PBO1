# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Person`, `Student`, dan `Main` adalah contoh dari class.

```bash
public class Person {
    ...
}

public class Student extends Person {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` Person person = new Person(name, age);` adalah contoh pembuatan object.

```bash
 Person person = new Person(name, age);
            person.displayInfo();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `name` dan `age` adalah contoh atribut.

```bash
 private String name;
    private int age;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Person` dan `Student`.

```bash
public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

public Student(String name, int age, String studentID, double[] grades) {
        super(name, age);
        this.studentID = studentID;
        this.grades = grades;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setName` adalah contoh method mutator.

```bash
 public void setName(String name) {
        this.name = name;
    }

    if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getAge,getStudent adalah contoh method accessor.

```bash
public int getAge() {
        return age;
    }

public String getStudentID() {
        return studentID;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String name;
    private int age;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class Student extends Person {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.


11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < numGrades; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Enter student ID: ");
            String studentID = scanner.next();

            System.out.print("Enter number of grades: ");
            int numGrades = scanner.nextInt();
            double[] grades = new double[numGrades];
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
for (int i = 0; i < numGrades; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rizki Wahyu Akhrida
NPM: 2110010267
