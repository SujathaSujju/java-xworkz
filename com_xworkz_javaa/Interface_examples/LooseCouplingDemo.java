package com_xworkz_javaa.Interface_examples;

import com_xworkz_javaa.Interface_examples.Loose_coupling.Computer;
import com_xworkz_javaa.Interface_examples.Loose_coupling.Epson;

public class LooseCouplingDemo {
 
	public static void main(String[] args) {
		
		Sony sony = new Sony();
		Epson epson = new Epson();
		Computer computer = new Computer();
		computer.slot(epson);
		
	}
}
