	  //-----------------------general information---------------------------
	  // this is a map program that create key value, this value has that word and the number 1 in a list of tupla
	  // create: Mario Jiménez García
	  // the last update 13-05-2015
	  // name of mapper: map_words.java class
	  //---------------------------------------------------------------------
	  

    String line = value.toString();                                                                //line to store the word

	String []value_compare = new String[4];                                                        //arrray to string in to save the word to reject
	


    boolean encontre=false;                                                                      //flag to identify if found a word in the list

    
    //----------------------------start to read the file , in this file it has all the words about the differents articles 
    for (String word : line.split("\\W+"))                                                       //read the first line
    {
    	
      if (word.length() > 0)                                                                      //identify that no this a blank space
      {
    	  //--------------------start the cicle that to compare the words between the words that not need use
    	  for(int i = 0; i<value_compare.length; i++)                                             
    	  {
    		  if (encontre==false)                                                                //if the flag is false then the word compare to the array list 
    		  {
	    		  if (word.equals(value_compare[i]))                    
		    	  {
		    		  encontre=true;                                                              //if we found the one word change the flag for true
		    	  }
		    	  else
		    	  {
		    		  encontre=false;                                                             // if not encontre is the same for false
		         }
    		  }
    	  }
    	  
    	  if (encontre==false)                                                                   // I need to know if some word about the array  is equal to the word in the articles if not to store the word
    	  {
    		  context.write(new Text(word), new IntWritable(1));                                 //create a tupla that it has the word and number 1 
    		  encontre=false;                                                                    //and change the flag to false
    	  }
      }
