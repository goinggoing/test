/**
 *	학교 정보 관리 통계 rmate 차트
 */

//통계차트1 함수
function statistics(data){
	
	$("#chartHolder").show();
    
    //-----------------------차트 설정 시작-----------------------

    //rMateChart 를 생성합니다.
    //파라메터 (순서대로)
    //1. 차트의 id ( 임의로 지정하십시오. )
    //2. 차트가 위치할 div 의 id (즉, 차트의 부모 div 의 id 입니다.)
    //3. 차트 생성 시 필요한 환경 변수들의 묶음인 chartVars
    //4. 차트의 가로 사이즈 (생략 가능, 생략 시 100%)
    //5. 차트의 세로 사이즈 (생략 가능, 생략 시 100%)
    rMateChartH5.create("chart1", "chartHolder", "", "100%", "100%");

    //스트링 형식으로 레이아웃 정의.
    var layoutStr  =  
      '<rMateChart backgroundColor="#FFFFFF" borderStyle="none">'
        +'<Options>'
          +'<Caption text="초등학교 별 집계" fontSize="20"/>'
//           +'<Legend/>'
        +'</Options>'
        +'<Column2DChart showDataTips="true">'
          +'<horizontalAxis>'
            +'<CategoryAxis categoryField="SCH_NM"/>'
          +'</horizontalAxis>'
          +'<verticalAxis>'
            +'<LinearAxis minimum="0" maximum="20" interval="10"/>'
          +'</verticalAxis>'
          +'<series>'
            +'<Column2DSeries labelPosition="outside" yField="CNT" displayName="CNT"/>'
          +'</series>'
        +'</Column2DChart>'
      +'</rMateChart>';
               
    //차트 데이터
    var chartData  = data.cnt;
//       [{"Month":"Jan", "2011":2.4},
//       {"Month":"Feb", "2011":3.8},
//       {"Month":"Mar", "2011":8.1},
//       {"Month":"Apr", "2011":5.1},
//       {"Month":"May", "2011":2.1},
//       {"Month":"Jun", "2011":5.2},
//       {"Month":"Jul", "2011":4.2}];
      
    rMateChartH5.calls("chart1", {
      "setLayout" : layoutStr,
      "setData" : chartData
    });

    //rMateChartH5.calls 함수를 이용하여 차트의 준비가 끝나면 실행할 함수를 등록합니다.
    //
    // argument 1 - rMateChartH5.create시 설정한 차트 객체 아이디 값
    // argument 2 - 차트준비가 완료되면 실행할 함수 명(key)과 설정될 전달인자 값(value)
    // 
    // 아래 내용은 
    // 1. 차트 준비가 완료되면 첫 전달인자 값을 가진 차트 객체에 접근하여
    // 2. 두 번째 전달인자 값의 key 명으로 정의된 함수에 value값을 전달인자로 설정하여 실행합니다.
    rMateChartH5.calls("chart1", {
      "setLayout" : layoutStr,
        "setData" : chartData
    });
     
    /**
     * rMateChartH5 3.0이후 버전에서 제공하고 있는 테마기능을 사용하시려면 아래 내용을 설정하여 주십시오.
     * 테마 기능을 사용하지 않으시려면 아래 내용은 삭제 혹은 주석처리 하셔도 됩니다.
     *
     * -- rMateChartH5.themes에 등록되어있는 테마 목록 --
     * - simple
     * - cyber
     * - modern
     * - lovely
     * - pastel
     * -------------------------------------------------
     *
     * rMateChartH5.themes 변수는 theme.js에서 정의하고 있습니다.
     */
    rMateChartH5.registerTheme(rMateChartH5.themes);
     
    /**
     * 샘플 내의 테마 버튼 클릭 시 호출되는 함수입니다.
     * 접근하는 차트 객체의 테마를 변경합니다.
     * 파라메터로 넘어오는 값
     * - simple
     * - cyber
     * - modern
     * - lovely
     * - pastel
     * - default
     *
     * default : 테마를 적용하기 전 기본 형태를 출력합니다.
     */
    function rMateChartH5ChangeTheme(theme){
        document.getElementById("chart1").setTheme(theme);
    }
     
    // -----------------------차트 설정 끝 -----------------------
	
}

//통계차트2 함수
function statistics2(data){
	
	$("#chartHolder2").show();
    
	// -----------------------차트 설정 시작-----------------------
	 
	// rMateChart 를 생성합니다.
	// 파라메터 (순서대로)
	//  1. 차트의 id ( 임의로 지정하십시오. )
	//  2. 차트가 위치할 div 의 id (즉, 차트의 부모 div 의 id 입니다.)
	//  3. 차트 생성 시 필요한 환경 변수들의 묶음인 chartVars
	//  4. 차트의 가로 사이즈 (생략 가능, 생략 시 100%)
	//  5. 차트의 세로 사이즈 (생략 가능, 생략 시 100%)
	rMateChartH5.create("chart2", "chartHolder2", "", "100%", "100%");
	 
	var layoutStr =
	             '<rMateChart backgroundColor="#FFFFFF" borderStyle="none" >'
	                  +'<Options>'
	                      +'<Caption text="초등학교 별 집계 현황"/>'
	                     +'<Legend useVisibleCheck="true"/>'
	                   +'</Options>'
	                 +'<CurrencyFormatter id="numFmt" currencySymbol="%" alignSymbol="right"/>'
	                    +'<Pie2DChart showDataTips="true">'
	               /* Pie2D 차트 생성시에 필요한 Pie2DChart 정의합니다. */
	               /* showDataTips : 데이터에 마우스를 가져갔을 때 나오는 Tip을 보이기/안보이기 속성입니다. */
	                      +'<series>'
	                           +'<Pie2DSeries nameField="SCH_NM" field="CNT" labelPosition="inside" color="#ffffff">'
	                         /* Pie2DChart 정의 후 Pie2DSeries labelPosition="inside"정의합니다 */
	                               +'<showDataEffect>'
	                               /* 차트 생성시에 Effect를 주고 싶을 때 showDataEffect정의합니다 */
	                                   +'<SeriesSlide duration="1000"/>'
	             /* SeriesSlide 효과는 시리즈 데이터가 데이터로 표시될 때 한쪽에서 미끄러지듯 나타나는 효과를 적용합니다. */
	                /* elementOffset : effect를 지연시키는 시간을 지정합니다 default:20 */
	                /* minimumElementDuration : 각 엘리먼트의 최소 지속 시간을 설정합니다 default:0 */
	                             /* 이 값보다 짧은 시간에 effect가 실행되지 않습니다. */
	              /* offset : effect개시의 지연시간을 설정합니다 default:0 */
	              /* perElementOffset : 각 엘리먼트의 개시 지연시간을 설정합니다. */
	                /* direction : left:왼쪽, right:오른쪽, up:위, down:아래 default는 left입니다. */
	                               +'</showDataEffect>'
	                          +'</Pie2DSeries>'
	                     +'</series>'
	                  +'</Pie2DChart>'
	              +'</rMateChart>';
	 
	// 차트 데이터
	var chartData = data.cnt;
	     
	// rMateChartH5.calls 함수를 이용하여 차트의 준비가 끝나면 실행할 함수를 등록합니다.
	//
	// argument 1 - rMateChartH5.create시 설정한 차트 객체 아이디 값
	// argument 2 - 차트준비가 완료되면 실행할 함수 명(key)과 설정될 전달인자 값(value)
	// 
	// 아래 내용은 
	// 1. 차트 준비가 완료되면 첫 전달인자 값을 가진 차트 객체에 접근하여
	// 2. 두 번째 전달인자 값의 key 명으로 정의된 함수에 value값을 전달인자로 설정하여 실행합니다.
	rMateChartH5.calls("chart2", {
	 "setLayout" : layoutStr,
	    "setData" : chartData
	});
	 
	/**
	 * rMateChartH5 3.0이후 버전에서 제공하고 있는 테마기능을 사용하시려면 아래 내용을 설정하여 주십시오.
	 * 테마 기능을 사용하지 않으시려면 아래 내용은 삭제 혹은 주석처리 하셔도 됩니다.
	 *
	 * -- rMateChartH5.themes에 등록되어있는 테마 목록 --
	 * - simple
	 * - cyber
	 * - modern
	 * - lovely
	 * - pastel
	 * -------------------------------------------------
	 *
	 * rMateChartH5.themes 변수는 theme.js에서 정의하고 있습니다.
	 */
	rMateChartH5.registerTheme(rMateChartH5.themes);
	 
	/**
	 * 샘플 내의 테마 버튼 클릭 시 호출되는 함수입니다.
	 * 접근하는 차트 객체의 테마를 변경합니다.
	 * 파라메터로 넘어오는 값
	 * - simple
	 * - cyber
	 * - modern
	 * - lovely
	 * - pastel
	 * - default
	 *
	 * default : 테마를 적용하기 전 기본 형태를 출력합니다.
	 */
	function rMateChartH5ChangeTheme(theme){
	    document.getElementById("chart2").setTheme(theme);
	}
	 
	// -----------------------차트 설정 끝 -----------------------
	
}

