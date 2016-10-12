<?php
	
		$end = 15;
		
		$first=0;
		$second=1;
		
		echo "[".$first;
		
		while($second<$end)
		{
			echo ", ". $second;
			$temp=$second;
			$second=$second+$first;
			$first=$temp;
		}
		
		echo "]";
		
?>