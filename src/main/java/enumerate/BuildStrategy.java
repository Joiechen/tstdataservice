package enumerate;

public enum BuildStrategy {

    SEARCH_ONLY{
        @Override
        void excuteStrategy(){
            System.out.print("search result from any system");
        }
    },
    CREATE_ONLY{
      @Override
      void excuteStrategy(){
          System.out.print("create data by data service");
      }
    },
    SMART{
      @Override
      void excuteStrategy(){
          System.out.print("search in system firstly then if no create by data service");
      }
    },
    OUT_OF_BOX{
      @Override
      void excuteStrategy(){
          System.out.print("use the out-of-box data");
      }
    };

    abstract void excuteStrategy();

}
