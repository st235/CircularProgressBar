# CircularProgressBar


<img src="/images/progress_bar.png" width="360" height="329">

![Min Android Sdk](https://img.shields.io/badge/minSdkVersion-16-FF4081.svg)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.st235/circularprogressbar.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.st235%22%20AND%20a:%circularprogressbar%22)

Like usual [Android ProgressBar](https://developer.android.com/reference/android/widget/ProgressBar) 
but circular ↻

## Download

- Maven

```text
<dependency>
  <groupId>com.github.st235</groupId>
  <artifactId>circularprogressbar</artifactId>
  <version>X.X</version>
  <type>pom</type>
</dependency>
```

- Gradle

```text
implementation 'com.github.st235:circularprogressbar:X.X'
```

- Ivy

```text
<dependency org='com.github.st235' name='circularprogressbar' rev='X.X'>
  <artifact name='circularprogressbar' ext='pom' ></artifact>
</dependency>
```

P.S.: Check out latest version code in badge at the top of this page.

## Usage

    <com.github.st235.circularprogressbar.CircularProgressBar
        android:id="@+id/progress_bar"
        android:layout_width="312dp"
        android:layout_height="312dp"
        android:padding="32dp"
        app:cpb_progress="0.7"
        app:cpb_progressBackgroundColor="@color/grey_300"
        app:cpb_progressBarColor="@color/purple_500"  />

## License

```text
MIT License

Copyright (c) 2023 Alex Dadukin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```

