package com.xworkz.SocialMedia.Dao;

public class Tester {

	public static void main(String[] args) {
		WhatsApp whatsApp=new WhatsApp();
		whatsApp.chat();
		whatsApp.voiceCall();
		whatsApp.videoCall();
		FaceBook faceBook=new FaceBook();
		faceBook.chat();
		faceBook.voiceCall();
		faceBook.videoCall();
		InstaGram instagram=new InstaGram();
		instagram.chat();
		instagram.voiceCall();
		instagram.videoCall();
	}

}
