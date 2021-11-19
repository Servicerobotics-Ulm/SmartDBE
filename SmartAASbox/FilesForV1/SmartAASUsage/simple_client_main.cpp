#include "ClientSocket.h"
#include "SocketException.h"
#include <iostream>
#include <string>
#include <thread>
#include <chrono>

void command (std::string ClientNum)
{
  try
    {

      ClientSocket client_socket ( "localhost", 1900 );
      std::string reply;

      try
	{
	  std::string base = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_SHOW_o_";
	  std::string targetid = "SmartAAS_x_SmartAAS_Commands_x_CommandINPUTSockets_x_AnotherCommandINPUTSocket_x_CommandText_x_CommandText_SemanticId";
  	  std::string value = "";
	  std::string msg = base + targetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";

	  value = "Run Job Number 999";
  	  std::string wrongtargetid = "Sending_x_a_x_Wrong_x_TargetID";
	  msg = base + wrongtargetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";  	 
	  
	  base = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_SET_o_"; 
	  targetid = "SmartAAS_x_SmartAAS_Commands_x_CommandINPUTSockets_x_AnotherCommandINPUTSocket_x_CommandText_x_CommandText";
	  
	  value = "Run Job Number 124";
	  msg = base + targetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";
          
	  value = "Run Job Number 120";
	  msg = base + targetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";  	 
          
	}
      catch ( SocketException& ) {}
    }
  catch ( SocketException& e )
    {
      std::cout << "Exception was caught:" << e.description() << "\n";
    }
}

std::string fetch (std::string ClientNum)
{
  std::string replybank = "";
  try
    {
      ClientSocket client_socket ( "localhost", 1900 );
      try
	{
	  std::string fetch = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_FETCH";
	  std::string chk = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_FETCH_o_ACK";
  	  client_socket << fetch;
   	  client_socket << "\n";
   	  std::cout << "OUT << " << fetch <<"\n";
          std::string reply = "";
   	  while(true){
	  	  client_socket >> reply;
		  std::cout << "IN >> "<< reply << "\n";
		  replybank = replybank + "\n" + reply;
		  std::size_t found = reply.find(chk);
		  if(found != std::string::npos){
		  	break;
		  }
          }          
	}
      catch ( SocketException& ) {}
    }
  catch ( SocketException& e )
    {
      std::cout << "Exception was caught:" << e.description() << "\n";
    }
   return replybank; 
}

int getinitialruntime(std::string ClientNum)
{
  try
    {
      ClientSocket client_socket ( "localhost", 1900 );
      std::string reply;
      try
	{
	  std::string base = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_SHOW_o_";
	  std::string targetid = "SmartAAS_x_SmartAAS_Commands_x_CommandINPUTSockets_x_AASSysDefaultCommandINPUTSocket_x_CommandText_x_CommandText";
  	  std::string value = "";
	  std::string msg = base + targetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";

	  // fetch and process
	  std::this_thread::sleep_for(std::chrono::milliseconds(2000));
	  std::string replybank = fetch(ClientNum);
	  std::string ss = msg + "_o_OK-DONE_o_VALUE[";
	  std::size_t found = replybank.find(ss);
	  if(found != std::string::npos){
	  	  std::string rem = replybank.substr(found+ss.length());
	  	  std::size_t found2 = rem.find("]_o_");
  	  	  if(found2 != std::string::npos){
  	  	  	std::string strval = rem.substr(0,found2);
  	  	  	int intval = atoi(strval.c_str());
	          	std::cout << "------------------------------------------Initial Runtime Counter: " << intval << "\n";
	          	return intval;	          	
	          }
	  }
	}
      catch ( SocketException& ) {}
    }
  catch ( SocketException& e )
    {
      std::cout << "Exception was caught:" << e.description() << "\n";
    }
    return -1;
}

void updateruntime(std::string ClientNum, int it, int add)
{
  try
    {
      ClientSocket client_socket ( "localhost", 1900 );
      std::string reply;

      try
	{
	  std::string base = "SmartAASToken_o_CLIENT-"+ClientNum+"_o_SET_o_"; 
	  std::string targetid = "SmartAAS_x_SmartAAS_Commands_x_CommandINPUTSockets_x_AASSysDefaultCommandINPUTSocket_x_CommandText_x_CommandText";
	  
	  int nt =it+add;	  
	  std::string value = ""+std::to_string(nt)+"";
	  std::string msg = base + targetid + "_o_" + value;
	  client_socket << msg;
  	  client_socket << "\n";
          std::cout << "OUT << " << msg <<"\n";
	  client_socket >> reply;
          std::cout << "IN >> "<< reply << "\n";
   	  std::cout << "------------------------------------------Final Runtime Counter: " << nt << "\n";
	}
      catch ( SocketException& ) {}
    }
  catch ( SocketException& e )
    {
      std::cout << "Exception was caught:" << e.description() << "\n";
    }
}


int main (int argc, char *argv[]){
	int tic = 20;
	std::string ClientNum = argv[1];
	std::cout << "ClientNum:" << ClientNum << "\n";
	int initialruntime = getinitialruntime(ClientNum);
	command(ClientNum);
	std::this_thread::sleep_for(std::chrono::milliseconds(4000));
	fetch(ClientNum);
	int toc = 40;
	updateruntime(ClientNum, initialruntime, toc-tic);
	std::this_thread::sleep_for(std::chrono::milliseconds(4000));
	fetch(ClientNum);
	return 0;
}

