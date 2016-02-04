package hu.bme.aut.gergelyszaz.BGS.core

import java.awt.Color
import java.util.Random

class Player {
	String ID
	Color color




	new(int id) {
		ID = null
		val r=new Random(id+360)
		color=new Color(r.nextFloat,r.nextFloat,r.nextFloat)
	}
	
	def getColor(){color}
	
	def String getId() {
		return ID
	}
	def void setId(String id){
		ID=id
	}
	def boolean IsConnected(){
		return ID!=null
	}

}
