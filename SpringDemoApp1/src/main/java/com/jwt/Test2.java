package com.jwt;

public class Test2 {
 
	private static final String NEWLINE_REGEX="\\r?\\n+";
	private static final String QUOTED_REPLY_PATTERN="On \\w{3}, \\w{3} \\d{1,2}, \\d{4} at \\d{1,2}:\\d{2} [AP]M(?: [\\w\\s]+)? <[\\w.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}>(?: [\\w\\s\\:]+)?";
	public static void main(String[] args) {
		/*
		 * String textBody
		 * ="Starting to strip quoted content. Original text body: Thank you for your assistance.\n"
		 * + "On Mon, Oct 7, 2024 at 2:10 PM <someone@tmnk.in> wrote:\n" +
		 * "> Thank you for your patience. To connect with an agent, please reach out to\n"
		 * +
		 * "> our customer service directly at the provided contact number or email. They\n"
		 * + "> will be able to assist you further.\n" + "";
		 */
		String textBody="Hi Kishore Sir,\n"
				+ "Please join the meeting \n"
				+ "\n"
				+ "\n"
				+ "Topic: Discussion on MercOnline_Coverity\n"
				+ "Time: Oct 4, 2024 12:00 PM Mumbai, Kolkata, New Delhi\n"
				+ "On Mon, Oct 7, 2024 at 3:46 PM John Doe <someone@tmnk.in> wrote:\n"
				+ "> As our human agents are currently unavailable so i would request you to\n"
				+ "> raise a ticket by clicking on the button below and will get back to you.";

		textBody = stripQuotedContent(textBody);
		System.out.println("Parsed clean text/plain body part: {}"+ textBody);
		
	}
	
	
	
	private static String stripQuotedContent(String textBody) {
		String[] lines = textBody.split(NEWLINE_REGEX);
		StringBuilder latestMessage = new StringBuilder();
		StringBuilder message = new StringBuilder();

		System.out.println("Starting to strip quoted content. Original text body: {}"+textBody);
		for (String line : lines) {
			System.out.println("Processing line: '{}'"+ line);
			if (line.matches(QUOTED_REPLY_PATTERN)) {
				System.out.println("Matched quoted reply pattern: '{}'. Stopping processing."+ line);
				break;
			}
			if (line.trim().isEmpty()) {
				System.out.println("Appending line: '{}'"+ line);
				latestMessage.append(line).append("\n");
			} else {
				System.out.println("Skipping empty line.");
			}
			message=message.append(line);
		}

		String cleanedMessage = latestMessage.toString().trim();
		System.out.println("Final cleaned message: {}"+ cleanedMessage);
		
		String newMsg=message.toString().trim();
		System.out.println("newMsg =="+newMsg);
		return newMsg;
	}
	
	
	public static String maskMobileNumber(String mobileNumber) {
		if (mobileNumber != null && mobileNumber.length() >= 4) {
			return mobileNumber.substring(0, mobileNumber.length() - 4) + "****";
		} else {
			return mobileNumber;
		}
	}
}
