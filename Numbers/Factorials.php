<?php

		$start=10;
		$sum=$start;
		
		echo $start;
		
		for($x=$start-1; $x>0; $x--)
		{
			echo " X " .$x;
			$sum *= $x;	
		}
		
		echo " = ".$sum;
		
?>