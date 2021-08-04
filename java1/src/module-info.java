module java1 {
	
	requires activation;
	requires mail;
	
	opens Day14 to activation, mail;
}