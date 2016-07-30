  
            /*
            $(document).ready(function () {
                        
                $("#cont").load("first-program.html");
                if (".intro".click) {
                    $("#cont").load("jvm.html");

                }

            });
            */
           
            //test code
         $(document).ready(function(){
                
        $("#cont").load("introduction.html");
        
         $(".first-program").click(function(){
        $("#cont").load("first-program.html");
         });
        $(".intro").click(function(){
        $("#cont").load("introduction.html");
        });
         $(".java-program").click(function(){
        $("#cont").load("java-program.html");
        });
        $(".byte-code").click(function(){
        $("#cont").load("byte-code.html");
        });
        });
      
