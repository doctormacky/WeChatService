package com.qx.wechat.kit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 21, 2020 8:30:07 PM
 *
 * @since: 1.0.0
 *
 * @Copyright: 2020 IBM All rights reserved.
 */
public class FileKit {

	/**
	 * decode base64 str to an wav file
	 * @param base64Code
	 * @param targetPath
	 * @throws IOException
	 */
	public static void decoderBase64File(String base64Code, String targetPath) throws IOException {
		Decoder decoder = Base64.getDecoder();
		byte[] result = decoder.decode(base64Code);
		FileOutputStream out;
		out = new FileOutputStream(targetPath);
		out.write(result);
		out.close();
	}

}
