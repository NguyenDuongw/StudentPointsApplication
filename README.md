# StudentPointsApplication
<h3>TỔNG QUAN DỰ ÁN</h3>
<div>Grade Student là ứng dụng cho phép người dùng nhập thông tin về điểm số của sinh viên sau đó hệ thống sẽ tính toán để đưa ra Grade phù hợp cho sinh viên đó (dựa vào các giá trị đã nhập vào và quy tắc xếp loại của trường).  </div> 
<h3>Mô tả ứng dụng</h3>
<p>Grade Student là ứng dụng cho phép người dùng nhập thông tin về điểm số của sinh viên sau đó hệ thống sẽ tính toán để đưa ra Grade phù hợp cho sinh viên đó (dựa vào các giá trị đã nhập vào và quy tắc xếp loại của trường).</p>
<p>Ứng dụng cần phải đảm bảo các chức năng cơ bản. Tuy nhiên, bạn có thể thêm chức năng bổ sung vào ứng dụng của bạn, nếu bạn muốn.</p>
<p><strong>Phần 1: Chức năng và yêu cầu cơ bản</strong></p>
<p><strong>1.<span style="white-space: pre;"> </span>Thiết kế giao diện</strong></p>
<p>Giao diên được thiết kế đơn giản dễ nhìn chạy trên log conssole</p>
<p style="font-size: 16px;"><img src="https://firebasestorage.googleapis.com/v0/b/funix-way.appspot.com/o/SE20%2FPRO192x%2FPRO192x_Asm%202.JPG?alt=media&amp;token=74ee7821-0b6b-427a-807b-7277f80e7446" alt="File preview"></p>
<p><strong>2.<span style="white-space: pre;"> </span>Yêu cầu chức năng cơ bản</strong></p>
<p>1.<span style="white-space: pre;"> </span>Khi chương trình được chạy, thì đầu tiên, sẽ hiển thị thông báo mô tả ngắn gọn về chương trình để người dùng hiểu được hệ thống này sẽ hoạt động thế nào, có chức năng gì. Ví dụ trong log trên thì thông báo hiển thị là: “This program reads exam/homework scores and reports your overall course grade”.&nbsp;</p>
<p>2.<span style="white-space: pre;"> </span>Sau đó, người dùng sẽ nhập điểm thi giữa kỳ - Midterm: Trong điểm thi giữa kỳ thì thông tin cần nhập là:&nbsp;</p>
<ul>
<ul>
<li>Weight (0-100): tức là trọng số của điểm thi giữa kỳ, và trọng số có giá trị là số nguyên dương sẽ nằm trong đoạn&nbsp;từ 0 tới 100. Ví dụ trong này là 20.</li>
<li>Score earned: là điểm số mà người dùng đã đạt được. Ví dụ trong này là 78.&nbsp;</li>
<li>Were scores shifted (1 = yes, 2=no): là điểm thi bạn có được tăng không, chọn 1 nếu có, chọn 2 nếu không. Ví dụ trong này là 2, có nghĩa là không được tăng.&nbsp; Vì không được tăng, nên dòng thông tin sau sẽ hiển thị luôn total points.&nbsp;</li>
<li>Total points: là tổng số điểm, bao gồm điểm ban đầu và số điểm được tăng thêm, điểm tối đa của total point là 100. Ví dụ trong này điểm sẽ là 78 + 0&nbsp; = 78.&nbsp;</li>
<li>Weighted score: Là điểm số đã tính dựa trên trọng số. Ví dụ trong này sẽ là weighted score =&nbsp; (78/100) * 20 = 15.6 (15.6 là điểm số tính trên thang điểm 20)</li>
</ul>
</ul>
<p>3.<span style="white-space: pre;"> </span>Tiếp theo, người dùng sẽ nhập điểm thi cuối kỳ - Final: Trong điểm thi cuối kỳ thì thông tin cần nhập là:</p>
<ul>
<ul>
<li>Weight (0-100): tức là trọng số của điểm thi giữa kỳ, và trọng số có giá trị là số nguyên dương sẽ nằm trong đoạn&nbsp;từ 0 tới 100. Ví dụ trong này là 35.</li>
<li>Score earned: là điểm số mà người dùng đã đạt được. Ví dụ trong này là 95.&nbsp;</li>
<li>Were scores shifted (1 = yes, 2=no): là điểm thi bạn có được tăng không, chọn 1 nếu có, chọn 2 nếu không. Ví dụ trong này là 1, có nghĩa là được tăng. Vì là được tăng, nên sau dòng này sẽ có dòng nhập Shift amount.&nbsp;</li>
<li>Shift amount:&nbsp; là số điểm mà đã được tăng. Ví dụ trong này là 10.&nbsp;</li>
<li>Total points: là tổng số điểm, bao gồm điểm ban đầu và số điểm được tăng thêm, điểm tối đa của total point là 100. Ví dụ trong này điểm sẽ là 95 + 10 = 105. Nhưng maximum của total points là 100 thôi, nên total sẽ chỉ được tính là 100.&nbsp;</li>
<li>Weighted score: Là điểm số đã tính dựa trên trọng số. Ví dụ trong này sẽ là weighted score =&nbsp; (100/100) * 35 = 35.0/35 (35 là điểm số tính trên thang điểm 35)</li>
</ul>
</ul>
<p>4.<span style="white-space: pre;"> </span>Cuối cùng, người dùng sẽ nhập điểm bài tập về nhà- Homework: Trong điểm bài tập về&nbsp; thì thông tin cần nhập là:</p>
<p>- Weight (0-100): tức là trọng số của điểm bài tập về nhà, và trọng số có giá trị là số nguyên dương sẽ nằm trong đoạn từ 0 tới 100. Ví dụ trong này là 45. (phải đảm bảo tổng 3 trọng số chính xác là 100).</p>
<p>- Number of assignments: là tổng số bài tập về nhà cần làm. Ví dụ trong này là 3 assignment.&nbsp;</p>
<p>- Theo đó số lượng đầu điểm cần nhập là 3 đầu điểm assignment. Với mỗi đầu điểm assignment thì sinh viên cần nhập cả 2 tham số là score và max.&nbsp;</p>
<ul>
<ul>
<li>Assignment 1 score and max:&nbsp; 18 20 trong đó 18 là điểm số thực của sinh viên đạt được, và 20 là điểm tối đa của bài assignment 1.&nbsp;</li>
<li>Assignment 2 score and max:&nbsp; 29 32 trong đó 29 là điểm số thực của sinh viên đạt được, và 32 là điểm tối đa của bài assignment 2.&nbsp;</li>
<li>Assignment 3 score and max:&nbsp; 31 40 trong đó 31 là điểm số thực của sinh viên đạt được, và 40 là điểm tối đa của bài assignment 3.</li>
</ul>
</ul>
<p><span style="font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif;">- Tổng điểm Assignment sẽ là: 18 + 29 + 31 = 78</span></p>
<p>- How many sections did you attend: 4 là số lượng buổi học sinh viên đã đi học và được điểm danh. Điểm này có thể hiểu là tính điểm chuyên cần cho sinh viên.&nbsp;</p>
<p>- Section points: Là tổng số điểm chuyên cần của sinh viên, với mỗi buổi được điểm danh, thì sinh viên sẽ được tính 5 điểm. Và tối đa điểm tính cho phần chuyên cần (attend) này là 30. Trong trường hợp này điểm chuyên cần của sinh viên là: 4 x 5 = 20. Total section points là 20/30.&nbsp;</p>
<p>- Total points: là tổng điểm số của sinh viên. Ví dụ trong trường hợp này tổng số điểm số của sinh viên đạt được là total = 18 + 29 + 31 + 20 = 98. Điểm tối đa của phần bài tập là: 20 + 32 + 40 + 30 = 122.&nbsp;</p>
<p>- Weighted score: là điểm tính theo trọng số thực tế. Ví dụ trong này weighted score = 98/122 * 45 =&nbsp; 36.1/45</p>
<p>Cách tính tổng quát trong công thức sau:&nbsp;</p>
<p><span id="docs-internal-guid-2d763ad3-7fff-9f05-fe55-ebdf98d384a8"><img alt="Screenshot 2019-06-17 at 17.35.59.png" src="https://lh4.googleusercontent.com/5tS68H-3ZOJiTqlkQ2X6jIYDAqdzsYyqWr9-pidFdYdm6XmO8HGa1IubEvMRTBLG2_9jk5xkXfvw1t2HRCNNHpfmPsGKRzAWJzE7bz0kfKN8VuO7yBGT1AexMMjr1L9g5fkMjo0" width="463" height="97" style="border: none;"></span></p>
<p>5.<span style="white-space: pre;"> </span>Hiển thị kết quả tổng cộng theo môn</p>
<p>- Overall percentage: 86.7 đây là tổng điểm sinh viên đạt được của 3 môn tính theo thang điểm 100. Ví dụ trong này thì overall percentage = 15.6&nbsp;+ 35.0 +&nbsp;36.1</p>
<p>- Your grade will be at least: 3.0 là grade tối thiểu sinh viên có thể đạt được dựa vào điểm số trung bình. Grade max là 4.0. Grade tối thiểu (min grade) dựa vào overall percentage Theo công thức sau:&nbsp;</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">- Quy tắc tính GPA:</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">a. Với min grade &gt;=85%: GPA=3.0;&nbsp;</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">b. min grade &gt;=75% và min grade &lt;85%: thì GPA = 2.0;&nbsp;</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">c. min grade &gt;=60% và min grade &lt;75%: thì GPA= 1.0;&nbsp;</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">d. min grade &lt; 60%: thì GPA= 0.0.&nbsp;</p>
<p style="text-rendering: optimizelegibility; margin-right: 0px; margin-left: 0px; padding: 0px; border: 0px; outline: 0px; font-variant-numeric: inherit; font-variant-east-asian: inherit; font-stretch: inherit; font-size: 16px; font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif; vertical-align: baseline;">Trong ví dụ này là 86.7, tức là rơi vào khoảng lớn hơn 85%, nên GPA sẽ là 3.0.</p>
<p><span style="font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif;">- Sau phần hiển thị GPA bạn&nbsp;thiết kế&nbsp;hiển thị thông báo (nhận xét) tuỳ ý dựa vào GPA của sinh viên.&nbsp;</span></p>
<p><em>Các điều kiện cần đảm bảo</em></p>
<ul>
<ul>
<li>Tổng điểm trọng số: trọng số của 3 phần điểm thi phải có tổng chính xác là 100. Nhỏ hơn hoặc lớn hơn 100 đều không được. Ví dụ trong này là 20 + 35 + 45 = 100.&nbsp;</li>
<li>Điểm tối đa của phần Assignment là 150, nếu vượt quá thì cũng chỉ tính là 150 điểm.&nbsp;</li>
<li>Điểm tối đa của phần Attend là 30, nếu vượt quá 30 thì vẫn chỉ tính là 30.&nbsp;</li>
<li>Phần Weighted score sẽ được làm tròn tới 1 chữ số đằng sau dấu thập phân.&nbsp;</li>
</ul>
</ul>














