/*******************************************************************************
 * Copyright (c) 2013 <Project SWG>
 * 
 * This File is part of NGECore2.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Using NGEngine to work with NGECore2 is making a combined work based on NGEngine. 
 * Therefore all terms and conditions of the GNU Lesser General Public License cover the combination.
 ******************************************************************************/
package protocol.swg;

import org.apache.mina.core.buffer.IoBuffer;


public class CmdSceneReady extends SWGMessage {

	public CmdSceneReady() {
		data = new byte[] { (byte)0x01, (byte)0x00, (byte)0x22, (byte)0x1C, (byte)0xFD, (byte)0x43 };
	}
	
	public void deserialize(IoBuffer data) {
		
	}
	
	public IoBuffer serialize() {
		return IoBuffer.wrap(data);
	}
}