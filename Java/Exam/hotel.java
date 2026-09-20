int N = 17;   // number of boys
int M = 13;   // number of girls
int K = 5;    // seats per room

int roomsBoys = (N + K - 1) / K;   // ceiling of N/K
int roomsGirls = (M + K - 1) / K;  // ceiling of M/K

int totalRooms = roomsBoys + roomsGirls;

System.out.println("Number of rooms to be booked: " + totalRooms);
