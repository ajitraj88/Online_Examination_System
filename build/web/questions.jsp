<%-- 
    Document   : questions
    Created on : Aug 11, 2018, 9:05:56 AM
    Author     : vinay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>questions</title>
        <style>

            ul{
                background-color: #222;
                list-style: none;
            }

            .header{

                height: 40px;

            }
            li:hover{
                background-color: #1199bb;
            }

            li a{
                color: #fff;
                text-decoration: none;
            }

            .header li{
                float:left;
                padding-right: 20px;
                height:40px;
                text: #fff;
                border: 100px;
            }

            .middle div{
                float:left;
                border: 2px;
                border-color: #222;
            }
            .questionNav table{
                width: 10%;
                margin-left: 10px;
            }
            .questionNav td{
                float: bottom;
            }
            .questionNav a{
                color: #fff;
                text-decoration: none;
                background-color: #222;
                list-style: none;
                width:400px;
            }
            .questionNav a:hover{
                background-color: #1199bb;
            }
            .questionArea p,input{
                margin-left: 50px;
            }
            .vertical-row {
                Float:left;
                height:500px;
                width:5px; /* edit this if you want */
                background-color: #444;
            } 
            .buttonlist li{
                float:left;
                margin-left: 10px;
            }
            .dot {
                height: 25px;
                width: 25px;
                background-color: #bbb;
                border-radius: 50%;
                display: inline-block;
            }
            table, th, td {
                border: 1px solid black;
            }
            .newClass{
                height: 25px;
                width: 25px;
                background-color: #009933;
                border-radius: 50%;
                display: inline-block;
            }
            

        </style>
    </head>
    
    <body onload="myFunction(1)">
        

        <ul class="header">
            <li style="color:#fff">
                <a href="studentd_dashboard.jsp">Home</a>
            </li>
            <li >
                <a >time remaining  <span id="time"></span></a>
            </li>
        </ul>



        <div class="middle">
            <div class="questionNav">
                <table><tr><th>questions</th>
                        <th>seen</th>
                        <th>answered</th>
                    </tr><tr>
                        <td >
                            <button type="button" onclick="myFunction(1)" >Q)1<br></button></td><td><span id="seen1" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(2)" >Q)2<br></button></td><td><span id="seen2" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(3)" >Q)3<br></button></td><td><span id="seen3" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(4)" >Q)4<br></button></td><td><span id="seen4" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(5)" >Q)5<br></button></td><td><span id="seen5" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(6)" >Q)6<br></button></td><td><span id="seen6" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td >
                            <button type="button" onclick="myFunction(7)" >Q)7<br></button></td><td><span id="seen7" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td>
                            <button type="button" onclick="myFunction(8)" >Q)8<br></button></td><td><span id="seen8" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td>
                            <button type="button" onclick="myFunction(9)" >Q)9<br></button></td><td><span id="seen9" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td>
                            <button type="button" onclick="myFunction(10)">Q)10<br></button></td><td><span id="seen10" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td>
                            <button type="button" onclick="myFunction(11)">Q)11<br></button></td><td><span id="seen11" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr><tr><td>
                            <button type="button" onclick="myFunction(12)">Q)12<br></button></td><td><span id="seen12" class="dot"></span></td><td><span class="dot"></span></td>
                    </tr>
                </table>     
            </div>
            <div class="vertical-row ">
            </div>
            <div class="questionArea" >
                <p id="question"></p>

                <input type="radio" name="radioanswer" value="option_a" id="radioanswer1" >option a<br>

                <input type="radio" name="radioanswer" value="option_b" id="radioanswer2" >option b<br>

                <input type="radio" name="radioanswer" value="option_c" id="radioanswer3" >option c<br>

                <input type="radio" name="radioanswer" value="option_d" id="radioanswer4" >option d<br><br>

                <input type="submit" value="submit" onclick="submit()"><br>
                <input type="submit" value="next" onclick="nextQuestion()"><br>
                <input type="submit" value="prev" onclick="prevQuestion()"><br>



            </div>
            <div id="loda"></div>
        </div>
        <script>
            
            
            function submit(){
                var ans;
               
                var ans1 = document.getElementById("radioanswer1").value;
                var ans2 = document.getElementById("radioanswer2").value;
                var ans3 = document.getElementById("radioanswer3").value;
                var ans4 = document.getElementById("radioanswer4").value;
                if (document.getElementById("radioanswer1").checked)
                    ans = ans1;
                if (document.getElementById("radioanswer2").checked)
                    ans = ans2;
                if (document.getElementById("radioanswer3").checked)
                    ans = ans3;
                if (document.getElementById("radioanswer4").checked)
                    ans = ans4;
            
                
                var Ans=""+ans;
                
                var questionno="submit";
                
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState === 4 && this.status === 200) {
                        var i=this.responseText;
                         document.location.href = "./Result?question=" + i + "&answer="+Ans+""; 
                        }
                };
                xhttp.open("GET", "./GetQuestion?question=" + questionno + "", true);
                xhttp.send();
                
                
            }
            
            
            function nextQuestion() {

                var questionno="getnextquestion";
                
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        var i=this.responseText;
                       
                        myFunction(i);
                        loadDoc(i);
                        }
                };
                xhttp.open("GET", "./GetQuestion?question=" + questionno + "", true);
                xhttp.send();
            }

            function prevQuestion() {
                 
              var questionno="getprevquestion";
                
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        var i=this.responseText;
                        
                        myFunction(i);
                        loadDoc(i);
                        
                    }
                };
                xhttp.open("GET", "./GetQuestion?question=" + questionno + "", true);
                xhttp.send();
            }
            function myFunction(n) {
                var str = "seen" + n;
                document.getElementById(str).className = 'newClass';
                loadDoc(n);
            }
            
            function startTimer(duration, display) {
                var timer = duration, hours, minutes, seconds;
                setInterval(function () {
                    hours = parseInt(timer / 3600, 10);
                    minutes = parseInt(timer / 180, 10);
                    seconds = parseInt(timer % 60, 10);

                    hours = hours < 10 ? "0" + hours : hours;
                    minutes = minutes < 10 ? "0" + minutes : minutes;
                    seconds = seconds < 10 ? "0" + seconds : seconds;

                    display.textContent = hours + ":" + minutes + ":" + seconds;

                    if (--timer < 0) {
                        submit();
                    }
                }, 1000);
            }
            
            window.onload=myFunction(1);

            window.onload=loadDoc(1);
            
            
            
            window.onload = function () {
                var fiveMinutes = 60 * 60 * 3;
                display = document.querySelector('#time');
                startTimer(fiveMinutes, display);
            };
      
            function loadDoc(q_no) {
                
                var ans;
               
                var ans1 = document.getElementById("radioanswer1").value;
                var ans2 = document.getElementById("radioanswer2").value;
                var ans3 = document.getElementById("radioanswer3").value;
                var ans4 = document.getElementById("radioanswer4").value;
                if (document.getElementById("radioanswer1").checked)
                    ans = ans1;
                if (document.getElementById("radioanswer2").checked)
                    ans = ans2;
                if (document.getElementById("radioanswer3").checked)
                    ans = ans3;
                if (document.getElementById("radioanswer4").checked)
                    ans = ans4;
            
                
                var Ans=""+ans;
                
                
                var i=q_no.toString();
                
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState === 4 && this.status === 200) {
                        document.getElementById("question").innerHTML =
                                this.responseText;
                        
                    }
                };
                xhttp.open("GET", "./GetQuestion?question=" + q_no.toString() + "&answer=" + Ans + "", true);
                xhttp.send();
            }
        </script>

    </body>
</html>
