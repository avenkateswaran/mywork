Feature:
  As a user of the UTM/TransferMicroservice
  I  want to trigger the UTM workflow
  So I can have my files processed

  Scenario: Trigger UTM workflow from DES and confirm successful journey
    Given the user connects to a unix sever with hostname: "10.102.157.90" with username: "xfer", password: "xfer10" and port number: "22"
    And the following file: "test1.xml" is pushed to the path: "/home/deda/utm/xfers/filein/gysp" in the unix server
    And the user accesses host: "http://10.102.81.61" and on port: "8281"
    When the user sends a POST to the DES tool with the following config "payload.xml"
    Then the user gets a "204" successful response

    Given the user connects to a unix sever with hostname: "10.104.184.30" with username: "tawatts", password: "1234tomwatts" and port number: "22"
    Then confirm the original file is present in the folder path: "/home/dwpxfr/outbound/pension/" in the unix server
    And then reset the filename







