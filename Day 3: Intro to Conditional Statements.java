Day 3: Intro to Conditional Statements

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String ans="";
        
        if(N % 2 == 1) {
         ans = "Weird";
        }
        else {
            if (N >= 2 && N <= 5)
                ans = "Not Weird";
            else if (N >= 6 && N <= 20)
                ans = "Weird";
            else if (N > 20)
                ans = "Not Weird"; 
        }
        System.out.println(ans);
