CXX = g++
CXXFLAGS = -O2 -fPIC -std=c++17
TARGET = test_runtime
OBJS = logo_runtime.o test_runtime.o

all: $(TARGET)

logo_runtime.o: logo_runtime.cpp logo_runtime.h
	$(CXX) $(CXXFLAGS) -c logo_runtime.cpp -o logo_runtime.o

test_runtime.o: test_runtime.cpp logo_runtime.h
	$(CXX) $(CXXFLAGS) -c test_runtime.cpp -o test_runtime.o

$(TARGET): $(OBJS)
	$(CXX) $(CXXFLAGS) $(OBJS) -o $(TARGET)

clean:
	rm -f $(OBJS) $(TARGET)
