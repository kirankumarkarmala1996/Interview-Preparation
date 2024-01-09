package com.singletonClass;

public class ClientApp {
	
	
	private  static ClientApp clientApp = null;

	private ClientApp() {

	}

	public static synchronized  ClientApp getInstance() {

		if (clientApp == null) {
			clientApp = new ClientApp();
		}
		return clientApp;
	}
	
	

	public void homePage() {
		System.out.println("HomePageMethod");
	}

	public void loginPage() {
		System.out.println("HomePageMethod");
	}

	public void registerPage() {
		System.out.println("registerPage");
	}

	public void AdminPage() {
		System.out.println("AdminPage");
	}

	public void AccountDetailsPage(){
		System.out.println("AccountDetailsPage");
		}

	public void paymentsPage(){
		System.out.println("paymentsPage");
		}

	public void OverViewPage(){
		System.out.println("OverViewPage");
		}

	

}
